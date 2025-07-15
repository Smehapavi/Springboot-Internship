package com.example.Springboot.repository;

import com.example.Springboot.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegisterRepository extends JpaRepository<RegisterDetails,Integer> {
    Optional<RegisterDetails> findByUserName(String username);
}