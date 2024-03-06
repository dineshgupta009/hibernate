package com.hibernate.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private long id;
    private String firstName;
    private String lastName;
    private String department;
    private long salary;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "EMPLOYEE_ACCOUNT",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "id")})
    private Set<Accounts> accounts;
}
