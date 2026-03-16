package com.jaanu.user_auth2.service;

import com.jaanu.user_auth2.dto.SignupRequest;
import com.jaanu.user_auth2.dto.UserUpdateRequest;
import com.jaanu.user_auth2.dto.UserViewDTO;

public interface UserService {
    public UserViewDTO createUser(SignupRequest userCreateRequest);
    public UserViewDTO updateUser(UserUpdateRequest userUpdateRequest);
    public void deleteUserByUserId(Long id);
    public UserViewDTO getUserByUserId(Long userId);
    public UserViewDTO getUserByEmail(String email);
    public UserViewDTO getUserByUsername(String username);
}
