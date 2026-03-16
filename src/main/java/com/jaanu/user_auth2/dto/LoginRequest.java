package com.jaanu.user_auth2.dto;

public record LoginRequest(
        String username,
        String password
) {
    public LoginRequest {}
}
