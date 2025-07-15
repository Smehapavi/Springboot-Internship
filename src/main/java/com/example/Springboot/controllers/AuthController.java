package com.example.Springboot.controllers;

import com.example.Springboot.models.RegisterDetails;
import com.example.Springboot.models.UserDetailsDto;
import com.example.Springboot.services.AuthService;
import com.example.Springboot.repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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
}