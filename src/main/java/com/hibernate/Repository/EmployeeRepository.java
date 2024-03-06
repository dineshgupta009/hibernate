package com.hibernate.Repository;

import com.hibernate.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Long> {

    Optional<Employee> findByIdAndFirstName(long id,String firstName);

    List<Employee> findByfirstName(String firstName);
}
