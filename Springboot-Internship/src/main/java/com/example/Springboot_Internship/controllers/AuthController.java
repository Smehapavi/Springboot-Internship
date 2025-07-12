package com.example.Springboot_Internship.controllers;

import com.example.Springboot_Internship.models.RegisterDetails;
import com.example.Springboot_Internship.models.UserDetailsDto;
import com.example.Springboot_Internship.services.AuthService;
import com.example.Springboot_Internship.repository.RegisterDetailsRepository;
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