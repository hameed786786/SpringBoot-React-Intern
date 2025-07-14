package com.example.springbootfirst.controllers;

import com.example.springbootfirst.models.RegisterDetails;
import com.example.springbootfirst.models.UserDetailsDto;
import com.example.springbootfirst.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public String addNewUser(@RequestBody UserDetailsDto register){
        return authService.addNewEmployee(register);
    }

    @PostMapping("/login")
    public String Login(@RequestBody RegisterDetails login){
        return authService.authenticate(login);
    }


    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public String updateEmployee(@PathVariable int id, @RequestBody RegisterDetails reg){
        return employeeService.updateEmployeeById(id, reg);
    }

    @GetMapping("/roles/{role}")
    @PreAuthorize("hasRole('ADMIN')")
    public List<RegisterDetails> getEmployeesByRoles(@PathVariable String role){
        return employeeService.findEmployeesByRole(role);
    }

}
