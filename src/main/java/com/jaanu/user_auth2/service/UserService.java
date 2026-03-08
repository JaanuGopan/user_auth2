package com.jaanu.user_auth2.service;

import com.jaanu.user_auth2.service.dto.*;

public interface UserService {
    public UserViewDTO createUser(UserCreateRequest userCreateRequest);
    public UserViewDTO updateUser(UserUpdateRequest userUpdateRequest);
    public void deleteUserByUserId(Long id);
    public UserViewDTO getUserByUserId(Long userId);
    public UserViewDTO getUserByEmail(String email);
    public UserViewDTO getUserByUsername(String username);
}
