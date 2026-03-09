package com.jaanu.user_auth2.service.Impl;

import com.jaanu.user_auth2.entity.User;
import com.jaanu.user_auth2.repository.UserRepository;
import com.jaanu.user_auth2.service.UserService;
import com.jaanu.user_auth2.service.dto.SignupRequest;
import com.jaanu.user_auth2.service.dto.UserUpdateRequest;
import com.jaanu.user_auth2.service.dto.UserViewDTO;
import com.jaanu.user_auth2.service.mapper.UserMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Override
    @Transactional
    public UserViewDTO createUser(SignupRequest userCreateRequest) {
        User user = UserMapper.mapUserCreateRequestToUser(userCreateRequest);
        User savedUser = userRepository.save(user);

        return UserMapper.mapUserToUserView(savedUser);
    }

    @Override
    @Transactional
    public UserViewDTO updateUser(UserUpdateRequest userUpdateRequest) {
        User user = UserMapper.mapUserUpdateRequestToUser(userUpdateRequest);
        User savedUser = userRepository.save(user);

        return UserMapper.mapUserToUserView(savedUser);
    }

    @Override
    @Transactional
    public void deleteUserByUserId(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserViewDTO getUserByUserId(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new IllegalArgumentException("User not found for this user id: " + userId)
        );

        return UserMapper.mapUserToUserView(user);
    }

    @Override
    public UserViewDTO getUserByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(
                () -> new IllegalArgumentException("User not found for this user email: " + email)
        );

        return UserMapper.mapUserToUserView(user);
    }

    @Override
    public UserViewDTO getUserByUsername(String username) {
        User user = userRepository.findByUsername(username).orElseThrow(
                () -> new IllegalArgumentException("User not found for this user username: " + username)
        );

        return UserMapper.mapUserToUserView(user);
    }
}
