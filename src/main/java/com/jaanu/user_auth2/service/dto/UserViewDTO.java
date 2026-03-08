package com.jaanu.user_auth2.service.dto;

import com.jaanu.user_auth2.enums.UserRole;

import java.util.HashMap;
import java.util.Map;

public record UserViewDTO(

        String firstname,
        String lastname,
        String email,
        String username,
        UserRole role,
        Map<String, Object> attributes
) {
    public UserViewDTO {
        if (attributes == null) {
            attributes = new HashMap<>();
        }
    }
}