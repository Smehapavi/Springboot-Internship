package com.example.Springboot_Internship.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int empId;
    private String name;
    private String jobrole;
}