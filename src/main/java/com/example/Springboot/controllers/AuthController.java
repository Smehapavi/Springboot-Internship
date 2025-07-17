package com.example.Springboot.controllers;

import com.example.Springboot.model.AuthResponse;
import com.example.Springboot.model.RegisterDetails;
import com.example.Springboot.model.UserDetailsDto;
import com.example.Springboot.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public String addNewUser(@RequestBody UserDetailsDto register){
        return authService.addNewEmployee(register);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> Login(@RequestBody RegisterDetails login){
        AuthResponse response = authService.authenticate(login);
        return ResponseEntity.ok(response);
    }
}