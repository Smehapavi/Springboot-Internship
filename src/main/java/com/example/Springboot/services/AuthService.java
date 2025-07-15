package com.example.Springboot.services;

import com.example.Springboot.jwt.JwtTokenProvider;
import com.example.Springboot.models.RegisterDetails;
import com.example.Springboot.models.Roles;
import com.example.Springboot.models.UserDetailsDto;
import com.example.Springboot.repository.RegisterDetailsRepository;
import com.example.Springboot.repository.RegisterRepository;
import com.example.Springboot.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    public Map<String, Object> authenticate(RegisterDetails login) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        login.getUserName(), login.getPassword()
                )
        );

        String token = jwtTokenProvider.generateToken(authentication);
        String role = "";
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            role = authority.getAuthority();
            break;
        }
        Map<String, Object> result = new HashMap<>();
        result.put("token", token);
        result.put("username", login.getUserName());
        result.put("role", role);

        return result;
    }
}