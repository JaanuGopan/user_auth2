package com.jaanu.user_auth2.service;

import com.jaanu.user_auth2.service.dto.LoginRequest;
import com.jaanu.user_auth2.service.dto.SignupRequest;
import com.jaanu.user_auth2.service.dto.UserViewDTO;

public interface AuthService {
    public UserViewDTO login(LoginRequest loginRequest);

    public UserViewDTO signup(SignupRequest signupRequest);
}
