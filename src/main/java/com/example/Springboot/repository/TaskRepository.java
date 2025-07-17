package com.example.Springboot.repository;

import com.example.Springboot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByAssignedEmployeeEmpId(int empId);
}