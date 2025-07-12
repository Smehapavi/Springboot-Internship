package com.example.Springboot_Internship.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    private String token;
    private String username;
    private String  roles;
}