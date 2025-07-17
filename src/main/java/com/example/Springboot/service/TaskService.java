package com.example.Springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Springboot.model.RegisterDetails;
import com.example.Springboot.model.Task;
import com.example.Springboot.repository.RegisterDetailsRepository;
import com.example.Springboot.repository.TaskRepository;


@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Autowired
    RegisterDetailsRepository registerDetailsRepository;

    public String assignTaskById(int empId, Task task) {
        RegisterDetails employee = registerDetailsRepository.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        task.setAssignedEmployee(employee);
        taskRepository.save(task);
        return "Task assigned successfully to employee ID " + empId;
    }

}