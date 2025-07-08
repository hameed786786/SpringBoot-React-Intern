package com.example.springbootfirst.Controllers;

import com.example.springbootfirst.Services.HelloWorldService;
import com.example.springbootfirst.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService hws;

    @GetMapping("/")
    public String getm(){
        return hws.getm();
    }

    @GetMapping("/employee")
    public List<Employee> getMethod(){
        return hws.getmethod();
    }
    @GetMapping("employee/{empId}")
    public Employee getEmployeeById(@PathVariable int empId){
        return hws.getEmployeeById(empId);
    }

    @GetMapping("job/{job}")
    public List<Employee> getEmployeeByJob(@PathVariable String job){
        return hws.getEmployeeByJob(job);
    }
    @GetMapping("name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        return hws.getEmployeeByName(name);
    }
    @PostMapping("/employee")
    public String postmethod(@RequestBody Employee employee){
        return hws.postmethod(employee);
    }
//
    @PutMapping("/employee")
    public String putmethod(@RequestBody Employee employee){
        return hws.putmethod(employee);
    }

    @DeleteMapping("employee/{empId}")
    public String deletemethod(@PathVariable int empId){
        return hws.deletebyid(empId);
    }

    @DeleteMapping("/employee")
    public String deletemethod(){
        return hws.deletemethod();
    }

}
