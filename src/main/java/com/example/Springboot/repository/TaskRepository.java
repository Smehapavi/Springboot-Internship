package com.example.Springboot.repository;

import com.example.Springboot.models.Task;
import com.example.Springboot.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByEmployee(RegisterDetails employee);
}