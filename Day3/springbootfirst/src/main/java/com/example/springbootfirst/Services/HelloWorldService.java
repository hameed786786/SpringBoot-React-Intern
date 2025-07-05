package com.example.springbootfirst.Services;

import com.example.springbootfirst.models.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    List<Employee> emp = new ArrayList<>(
            Arrays.asList(new Employee(1,"prasanth","trainer"),new Employee(2,"yuvaraj","faculty"))
    );


    public List<Employee> getmethod(){
        System.out.println(emp);
        return emp;
    }

    public String postmethod(Employee employee){
        emp.add(employee);
        return "employee added successful   ly";
    }

    public String putmethod(int empId,@RequestBody Employee employee){
        for(int i=0;i<emp.size();i++){
            if(empId==emp.get(i).getEmpId()){
                emp.set(i,employee);
            }
        }
        return "employee updated successfully";
    }



    public Employee getEmployeeById(int empId) {
        int ind = 0;
        boolean flag = false;
        for(int i=0;i<emp.size();i++){
            if(empId==emp.get(i).getEmpId()){
                ind = i;
                flag=true;
            }

        }
        if(flag){
           return emp.get(ind);
        }
        return new Employee();
    }
    public String deletemethod(int empId){
        for(int i=0;i<emp.size();i++){
            if(empId==emp.get(i).getEmpId()){
                emp.remove(i);
            }

        }
        return "deleted successfully";

    }

}
