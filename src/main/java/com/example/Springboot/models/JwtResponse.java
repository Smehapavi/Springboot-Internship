package com.example.Springboot.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    private String token;
    private String username;
    private String  roles;
}