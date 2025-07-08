package com.example.Springboot_Internship.controllers;

import com.example.Springboot_Internship.Services.HelloWorldService;
import com.example.Springboot_Internship.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloworldController {

    @Autowired
    private HelloWorldService hws;

    @GetMapping("/{empid}")
    public Employee getEmployeeById(@PathVariable int empid) {
        return hws.getEmployeeById(empid);
    }

    @PostMapping("/post")
    public String postMethod(@RequestBody Employee Emp) {
        return hws.post(Emp);
    }

    @PutMapping("/put")
    public String putMethod(@RequestBody Employee Emp) {
        return hws.updateRecord(Emp);
    }

    @DeleteMapping("/{empid}")
    public String deleteMethod(@PathVariable int empid) {
        return hws.deleteEmployeeById(empid);
    }
}