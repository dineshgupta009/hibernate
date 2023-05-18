package com.hibernate.Service;

import com.hibernate.Entity.Employee;
import com.hibernate.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> getEmployeeByfirstName(String firstName) {
        Optional<Employee> employee= employeeRepository.findByfirstName(firstName);
        return employee;
    }
}
