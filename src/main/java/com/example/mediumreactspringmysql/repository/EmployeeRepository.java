package com.example.mediumreactspringmysql.repository;

import com.example.mediumreactspringmysql.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}