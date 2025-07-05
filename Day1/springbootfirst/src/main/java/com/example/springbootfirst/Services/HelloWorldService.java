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

    public String postmethod(Employee employee){
        emp.add(employee);
        return "employee added successfully";
    }

    public String putmethod(){
        return "You are in putmethod";
    }

    public String deletemethod(){
        return "You are in deletemethod";
    }
}
