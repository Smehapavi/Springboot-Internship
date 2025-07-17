package com.example.Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Springboot.model.RegisterDetails;
import java.util.Optional;

public interface RegisterRepository extends JpaRepository<RegisterDetails,Integer> {
    Optional<RegisterDetails> findByUserName(String username);
}