package com.jaanu.user_auth2.api.dto;

import com.jaanu.user_auth2.enums.UserRole;
import java.util.Map;

public record LoginResponse(
        String token,
        String firstname,
        String lastname,
        String email,
        String username,
        UserRole role,
        Map<String, Object> attributes
) {}