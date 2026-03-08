package com.jaanu.user_auth2.service.dto;

import com.jaanu.user_auth2.enums.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.HashMap;
import java.util.Map;

public record UserUpdateRequest(

        @NotBlank(message = "First name is required")
        String firstname,

        @NotBlank(message = "Last name is required")
        String lastname,

        @Email(message = "Invalid email format")
        @NotBlank(message = "Email is required")
        String email,

        @NotBlank(message = "Username is required")
        String username,

        // Optional password (can be null if not updating)
        String password,

        @NotNull(message = "Role is required")
        UserRole role,

        /**
         * Additional attributes for user.
         * Default to empty map if null.
         */
        Map<String, Object> attributes
) {
    public UserUpdateRequest {
        if (attributes == null) {
            attributes = new HashMap<>();
        }
    }
}