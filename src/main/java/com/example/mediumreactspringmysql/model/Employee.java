package com.example.mediumreactspringmysql.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "tb_emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String name;

    @Column
    private String gender;

    @Column
    private String department;

    @Column
    private Date dob;

    @Override
    public String toString() {
        return "Employee [id = " + id + ", name = " + name + ", gender = " + gender + ", department = " + department + ", dob = " + dob + "]";
    }

    public Employee() {}

    public Employee(long id) {
        this.id = id;
    }
    
    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(long id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Employee(long id, String name, String gender, String department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
    }
    
    public Employee(long id, String name, String gender, String department, Date dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.dob = dob;
    }

    public Employee(String name, String gender, String department, Date dob) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}