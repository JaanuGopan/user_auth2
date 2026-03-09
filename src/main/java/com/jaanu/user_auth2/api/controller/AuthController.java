package com.jaanu.user_auth2.api.controller;

import com.jaanu.user_auth2.api.dto.LoginResponse;
import com.jaanu.user_auth2.api.dto.SignupResponse;
import com.jaanu.user_auth2.service.dto.LoginRequest;
import com.jaanu.user_auth2.service.dto.SignupRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){

    }

    @PostMapping("/signup")
    public ResponseEntity<SignupResponse> signup(@RequestBody SignupRequest signupRequest){

    }

}
