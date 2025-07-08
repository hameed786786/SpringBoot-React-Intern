package com.example.springbootfirst.Services;

import com.example.springbootfirst.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    RegisterRepository regRepo;

}
