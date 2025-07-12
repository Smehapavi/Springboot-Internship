package com.example.Springboot_Internship.controllers;

import com.example.Springboot_Internship.models.RegisterDetails;
import com.example.Springboot_Internship.repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RegisterDetailsRepository userRepository;

    @PostMapping("/add")
    public RegisterDetails addUser(@RequestBody RegisterDetails user) {
        return userRepository.save(user); // ✅ Correct usage
    }

    @GetMapping("/all")
    public List<RegisterDetails> getAllUsers() {
        return userRepository.findAll(); // ✅ Correct usage
    }
}