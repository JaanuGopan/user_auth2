package com.jaanu.user_auth2.service.mapper;

import com.jaanu.user_auth2.entity.User;
import com.jaanu.user_auth2.service.dto.SignupRequest;
import com.jaanu.user_auth2.service.dto.UserUpdateRequest;
import com.jaanu.user_auth2.service.dto.UserViewDTO;

public class UserMapper {

    public static User mapUserCreateRequestToUser(SignupRequest userCreateRequest){
        User user = new User();
        user.setFirstname(userCreateRequest.firstname());
        user.setLastname(userCreateRequest.lastname());
        user.setEmail(userCreateRequest.email());
        user.setRole(userCreateRequest.role());
        user.setPassword(userCreateRequest.password());
        user.setUsername(userCreateRequest.username());
        user.setAttributes(userCreateRequest.attributes());

        return user;
    }

    public static User mapUserUpdateRequestToUser(UserUpdateRequest userUpdateRequest){
        User user = new User();
        user.setFirstname(userUpdateRequest.firstname());
        user.setLastname(userUpdateRequest.lastname());
        user.setEmail(userUpdateRequest.email());
        user.setRole(userUpdateRequest.role());
        user.setPassword(userUpdateRequest.password());
        user.setUsername(userUpdateRequest.username());
        user.setAttributes(userUpdateRequest.attributes());

        return user;
    }

    public static UserViewDTO mapUserToUserView(User user){
        return new UserViewDTO(
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getUsername(),
                user.getRole(),
                user.getAttributes()
        );
    }
}
