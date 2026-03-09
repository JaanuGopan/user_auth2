package com.jaanu.user_auth2.api.controller;

import com.jaanu.user_auth2.api.dto.LoginResponse;
import com.jaanu.user_auth2.api.dto.SignupResponse;
import com.jaanu.user_auth2.service.AuthService;
import com.jaanu.user_auth2.service.dto.LoginRequest;
import com.jaanu.user_auth2.service.dto.SignupRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @PostMapping("/signup")
    public ResponseEntity<SignupResponse> signup(@Valid @RequestBody SignupRequest signupRequest){
        return ResponseEntity.ok(authService.signup(signupRequest));
    }
}