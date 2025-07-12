package com.example.Springboot_Internship.repository;

import com.example.Springboot_Internship.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegisterDetailsRepository extends JpaRepository<RegisterDetails, Integer> {

    RegisterDetails findByEmail(String email);

    Optional<Object> findByUserName(String username);

    boolean existsByEmail(String email);
    List<RegisterDetails> findByRolesRoleName(String roleName);
}