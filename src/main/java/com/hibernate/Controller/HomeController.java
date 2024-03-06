package com.hibernate.Controller;

import com.hibernate.Entity.Address;
import com.hibernate.Entity.Employee;
import com.hibernate.Repository.AddressRepository;
import com.hibernate.Repository.EmployeeRepository;
import com.hibernate.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class HomeController {


    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;
    public HomeController(EmployeeRepository employeeRepository, EmployeeService employeeService) {
        this.employeeRepository = employeeRepository;
        this.employeeService = employeeService;
    }

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployeesById(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

    @DeleteMapping("/employee")
    public void delete(@RequestParam("id") long id) {
        employeeRepository.deleteById(id);
    }

    @GetMapping("/employee")
    public Optional<Employee> delete1(@RequestParam("id") long id, @RequestParam("firstName") String firstName) {
        return employeeRepository.findByIdAndFirstName(id, firstName);
    }

    @PostMapping("/employeeSave")
    public Employee saveEmployees(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PostMapping("/address")
    public Address saveAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }

    @GetMapping("/get")
    public List<Employee> delete23(@RequestParam("firstName") String firstName) {



        return employeeService.getEmployeeByfirstName(firstName);

    }

}
