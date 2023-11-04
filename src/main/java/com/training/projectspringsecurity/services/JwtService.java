package com.training.projectspringsecurity.services;

import java.util.Map;
import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    public String extractUserName(String token);
    String generateToken(UserDetails userdetails);
    boolean isTokenValid(String token, UserDetails userDetails);
    String refreshToken(Map<String, Object> extraClaims, UserDetails userDetails);
}
