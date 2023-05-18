package com.hibernate.Service;


import com.hibernate.Entity.Employee;

import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> getEmployeeByfirstName(String firstName);
}
