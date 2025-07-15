package com.example.Springboot.controllers;

import com.example.Springboot.models.RegisterDetails;
import com.example.Springboot.models.Task;
import com.example.Springboot.models.UserDetailsDto;
import com.example.Springboot.services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void testRoute() {
        String result = employeeController.route();
        assertEquals("Welcome to SpringBoot Security", result);
    }
    @Test
    void testGetMethod() {
        RegisterDetails emp1 = new RegisterDetails();
        RegisterDetails emp2 = new RegisterDetails();
        when(employeeService.getMethod()).thenReturn(Arrays.asList(emp1, emp2));

        List<RegisterDetails> result = employeeController.getMethod();
        assertEquals(2, result.size());
    }
    @Test
    void testGetAllEmployees() {
        RegisterDetails emp = new RegisterDetails();
        emp.setName("Pavithra");
        when(employeeService.getAllEmployees()).thenReturn(List.of(emp));
        List<RegisterDetails> employees = employeeController.getAllEmployees();
        assertEquals(1, employees.size());
        assertEquals("Pavithra", employees.get(0).getName());
    }
    @Test
    void testGetEmployeeById() {
        RegisterDetails emp = new RegisterDetails();
        emp.setEmpId(107);
        emp.setName("pavi");
        when(employeeService.getEmployeeById(100)).thenReturn(emp);
        RegisterDetails result = employeeController.getEmployeeById(100);
        assertEquals("pavi", result.getName());
        assertEquals(107, result.getEmpId());
    }

    @Test
    void testAddEmployee() {
        UserDetailsDto dto = new UserDetailsDto();
        dto.setName("Employee");
        when(employeeService.addNewEmployee(dto)).thenReturn("Added");
        String response = employeeController.addEmployee(dto);
        assertEquals("Added", response);
    }

}