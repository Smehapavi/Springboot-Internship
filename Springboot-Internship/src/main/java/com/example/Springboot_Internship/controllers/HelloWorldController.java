package com.example.Springboot_Internship.controllers;

import com.example.Springboot_Internship.models.Student;
import com.example.Springboot_Internship.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService hws;

    @GetMapping("/hello")
    public List<Student> hello(){
//        System.out.println("Hello world");
//        return "Hello world this is universe";
        return hws.getEmp();
    }

    //post method
    @PostMapping("/hello")
    public String postmethod(){
        return hws.postmethod();
    }

    @PutMapping("/hello")
    public String putmethod(){
        return hws.putmethod();
    }

    @DeleteMapping("/hello")
    public String deletemethod(){
        return hws.deletemethod();
    }
}