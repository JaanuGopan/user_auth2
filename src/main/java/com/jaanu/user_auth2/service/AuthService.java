package com.jaanu.user_auth2.service;

import com.jaanu.user_auth2.api.dto.LoginResponse;
import com.jaanu.user_auth2.api.dto.SignupResponse;
import com.jaanu.user_auth2.service.dto.LoginRequest;
import com.jaanu.user_auth2.service.dto.SignupRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    SignupResponse signup(SignupRequest signupRequest);
}