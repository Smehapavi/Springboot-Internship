package com.example.Springboot_Internship.repository;

import com.example.Springboot_Internship.models.Task;
import com.example.Springboot_Internship.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByEmployee(RegisterDetails employee);
}