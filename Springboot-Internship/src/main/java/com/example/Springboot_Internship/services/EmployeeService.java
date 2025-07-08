package com.example.Springboot_Internship.services;

import com.example.Springboot_Internship.models.Employee;
//import com.example.Springboot_Internship.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> emp1 = new ArrayList<>(
            Arrays.asList(new Employee(1,"Karthika","manager")));

    public List<Employee> getEmp() {
//        return "hello world";
        return emp1;
    }
    public String postmethod(){
        return "this is post method";
    }
    public String putmethod(){
        return "this is put method";
    }
    public String deletemethod(){
        return "this is delete method";
    }
}