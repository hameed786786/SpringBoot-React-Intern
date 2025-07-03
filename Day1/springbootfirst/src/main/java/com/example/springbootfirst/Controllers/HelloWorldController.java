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
    HelloWorldService employee;

    @GetMapping("/")
    public List<Employee> getMethod(){
        return employee.getmethod();
    }

//    @PostMapping("/post")
//    public String postmethod(){
//        return hs.postmethod();
//    }
//
//    @PutMapping("/put")
//    public String putmethod(){
//        return hs.putmethod();
//    }
//
//    @DeleteMapping("/delete")
//    public String deletemethod(){
//        return hs.deletemethod();
//    }

}
