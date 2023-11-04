package com.training.projectspringsecurity.services;

import com.training.projectspringsecurity.dto.JwtAuthenticationResponse;
import com.training.projectspringsecurity.dto.RefreshTokenRequest;
import com.training.projectspringsecurity.dto.SignInRequest;
import com.training.projectspringsecurity.dto.SignUpRequest;
import com.training.projectspringsecurity.entities.User;

public interface AuthenticationService {
    User signUp(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signIn(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshTokenRequest(RefreshTokenRequest refreshTokenRequest);
}
