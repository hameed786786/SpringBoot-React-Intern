package com.example.springbootfirst.Services;

import com.example.springbootfirst.models.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    List<Employee> emp = new ArrayList<>(
            Arrays.asList(new Employee(1,"prasanth","trainer"),new Employee(2,"yuvaraj","faculty"))
    );


    public List<Employee> getmethod(){
        return emp;
    }

    public String postmethod(){
        return "You are in postmethod";
    }

    public String putmethod(){
        return "You are in putmethod";
    }

    public String deletemethod(){
        return "You are in deletemethod";
    }
}
