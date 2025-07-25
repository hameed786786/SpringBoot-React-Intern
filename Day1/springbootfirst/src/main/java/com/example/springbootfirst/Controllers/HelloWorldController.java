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

    @PostMapping
    public String postmethod(@RequestBody Employee employee){
        return hws.postmethod(employee);
    }
//
    @PutMapping
    public String putmethod(){
        return hws.putmethod();
    }

    @DeleteMapping
    public String deletemethod(){
        return hws.deletemethod();
    }

}
