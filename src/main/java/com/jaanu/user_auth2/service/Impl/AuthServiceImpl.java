package com.jaanu.user_auth2.service.Impl;

import com.jaanu.user_auth2.api.dto.LoginResponse;
import com.jaanu.user_auth2.api.dto.SignupResponse;
import com.jaanu.user_auth2.entity.User;
import com.jaanu.user_auth2.repository.UserRepository;
import com.jaanu.user_auth2.security.JwtService;
import com.jaanu.user_auth2.service.AuthService;
import com.jaanu.user_auth2.service.dto.LoginRequest;
import com.jaanu.user_auth2.service.dto.SignupRequest;
import com.jaanu.user_auth2.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    public SignupResponse signup(SignupRequest request) {
        User user = UserMapper.mapUserCreateRequestToUser(request);
        user.setPassword(passwordEncoder.encode(request.password())); // Hash the password

        var savedUser = userRepository.save(user);
        var jwtToken = jwtService.generateToken(savedUser);

        return new SignupResponse(
                jwtToken,
                savedUser.getFirstname(),
                savedUser.getLastname(),
                savedUser.getEmail(),
                savedUser.getUsername(),
                savedUser.getRole(),
                savedUser.getAttributes()
        );
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.username(),
                        request.password()
                )
        );

        var user = userRepository.findByUsername(request.username())
                .orElseThrow(() -> new IllegalArgumentException("Invalid username or password"));

        var jwtToken = jwtService.generateToken(user);

        return new LoginResponse(
                jwtToken,
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getUsername(),
                user.getRole(),
                user.getAttributes()
        );
    }
}