package com.example.Springboot.repository;

import com.example.Springboot.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository<Roles, Integer> {

    static Optional<Roles> findByRoleName(String roleName) {
        return null;
    }
}