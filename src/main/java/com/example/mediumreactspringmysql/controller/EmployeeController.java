package com.example.mediumreactspringmysql.controller;

import java.util.List;

import com.example.mediumreactspringmysql.model.Employee;
import com.example.mediumreactspringmysql.repository.EmployeeRepository;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    // Dependency injection
    private EmployeeRepository empRepo;

    public EmployeeController(EmployeeRepository empRepo) {
        this.empRepo = empRepo;
    }

    // Display all employees
    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return empRepo.findAll();
    }

    // Add a new employee
    @PostMapping("/employee/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        empRepo.save(employee);

        return employee;
    }

    // Display single employee by ID
    @GetMapping("/employee/{id}")
    public Employee findSingleEmployee(@PathVariable Long id) {
        return empRepo.getOne(id);
    }

    // Edit employee information
    @PutMapping("/employee/edit/{id}")
    public Employee editEmployee(@RequestBody Employee employee) {
        empRepo.save(employee);

        return employee;
    }

    // Delete employee
    @DeleteMapping("/employee/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        Employee emp = findSingleEmployee(id);

        empRepo.delete(emp);

        return "Employee removed with id " + id;
    }
}