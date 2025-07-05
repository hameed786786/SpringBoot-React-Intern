package com.example.springbootfirst.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int empID;
    private String name;
    private String job;

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Employee(int id, String name, String role) {
        this.job=role;
        this.name=name;
        this.empID=id;
    }
}
