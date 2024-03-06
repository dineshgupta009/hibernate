package com.hibernate.Service;


import com.hibernate.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getEmployeeByfirstName(String firstName);
}
