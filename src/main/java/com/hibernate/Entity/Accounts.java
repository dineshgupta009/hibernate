package com.hibernate.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long accountNo;
    @ManyToOne
    private Employee employee;
}
