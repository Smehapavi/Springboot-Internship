package com.example.Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Springboot.model.Roles;
import java.util.Optional;

public interface RolesRepository extends JpaRepository<Roles,Integer> {
    Optional<Roles> findByRoleName(String roleName);
}