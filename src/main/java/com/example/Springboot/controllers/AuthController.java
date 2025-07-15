package com.example.Springboot.controllers;

import com.example.Springboot.models.RegisterDetails;
import com.example.Springboot.models.UserDetailsDto;
import com.example.Springboot.services.AuthService;
import com.example.Springboot.repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody RegisterDetails loginRequest) {
        String response = authService.authenticate(loginRequest).toString();
        return ResponseEntity.ok(response);
    }
}