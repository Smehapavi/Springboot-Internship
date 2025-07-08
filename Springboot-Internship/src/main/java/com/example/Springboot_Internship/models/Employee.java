package com.example.Springboot_Internship.models;

public class Employee {
    private static int empid;
    private String Name;
    private String role;

    public Employee(int empid, String name, String role) {
        this.empid = empid;
        this.Name = name;
        this.role = role;
    }

    public Employee() {

    }

    public static int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}