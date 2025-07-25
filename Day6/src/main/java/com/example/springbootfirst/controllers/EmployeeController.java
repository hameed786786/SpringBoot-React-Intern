package com.example.springbootfirst.controllers;

import com.example.springbootfirst.models.Employee;
import com.example.springbootfirst.models.RegisterDetails;
import com.example.springbootfirst.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/")
    public String  hello(){
        return "Spring security";
    }
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/employee")
    public List<Employee> getMethod() {
       return employeeService.getMethod();
    }
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("/employee")
    public String postMethod(@RequestBody RegisterDetails employee) {
        return employeeService.addEmployee(employee);
    }
    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/employee/id/{id}")
    public Employee getEmployeeById(@PathVariable int id) {

        return hws.getEmployeeById(id);
    }
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/employee/job/{job}")
    public List<Employee> getEmployeeByJob(@PathVariable String job) {

        return hws.getEmployeeByJob(job);
    }
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PutMapping("/employee")
    public String putMethod(@RequestBody Employee employee) {
        return hws.putMethod( employee);
    }
    @PreAuthorize("hasAnyRole('ADMIN')")
    @DeleteMapping("/employee/{id}")

    public String deleteMethod(@PathVariable int id) {
        return hws.deleteMethod(id);
    }
    @PreAuthorize("hasAnyRole('ADMIN')")
    @DeleteMapping("/employee")

    public String deleteallMethod() {
        return hws.deleteallMethod();
    }
}
