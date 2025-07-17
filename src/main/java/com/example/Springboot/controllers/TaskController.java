package com.example.Springboot.controllers;

import com.example.Springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.example.Springboot.model.Task;
import com.example.Springboot.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService t;

    @Autowired
    EmployeeService employeeService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/id/{empId}")
    public String assignTaskById(@PathVariable int empId, @RequestBody Task task) {
        return t.assignTaskById(empId, task);
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/employee/{empId}")
    public List<Task> getTasksByEmployee(@PathVariable int empId) {
        return employeeService.getTasksByEmployeeId(empId);
    }

}