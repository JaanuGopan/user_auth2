package com.jaanu.user_auth2.api.controller;

import com.jaanu.user_auth2.dto.UserViewDTO;
import com.jaanu.user_auth2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserViewDTO> getUserById(@PathVariable Long userId){
        return ResponseEntity.ok(userService.getUserByUserId(userId));
    }
}
