package com.example.springbootfirst.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int empId;
    private String name;
    private String job;
    public Employee(int id, String name, String job) {
        this.empId=id;
        this.name=name;
        this.job=job;

    }

    public Employee() {

    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
