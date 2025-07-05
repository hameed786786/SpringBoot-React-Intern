package com.example.springbootfirst.Controllers;

import com.example.springbootfirst.Services.HelloWorldService;
import com.example.springbootfirst.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class HelloWorldController {
    @Autowired
    private HelloWorldService hws;

    @GetMapping
    public List<Employee> getMethod(){
        return hws.getmethod();
    }
    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable int empId){
        return hws.getEmployeeById(empId);
    }
    @PostMapping
    public String postmethod(@RequestBody Employee employee){
        return hws.postmethod(employee);
    }
//
    @PutMapping("/{empId}")
    public String putmethod(@PathVariable int empId,@RequestBody Employee employee){
        return hws.putmethod(empId,employee);
    }

    @DeleteMapping("/{empId}")
    public String deletemethod(@PathVariable int empId){
        return hws.deletemethod(empId);
    }

}
