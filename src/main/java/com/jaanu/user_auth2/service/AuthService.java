package com.jaanu.user_auth2.service;

import com.jaanu.user_auth2.dto.LoginResponse;
import com.jaanu.user_auth2.dto.SignupResponse;
import com.jaanu.user_auth2.dto.LoginRequest;
import com.jaanu.user_auth2.dto.SignupRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    SignupResponse signup(SignupRequest signupRequest);
}