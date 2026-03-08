package com.jaanu.user_auth2.repository;

import com.jaanu.user_auth2.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(@NotNull @Email String email);

    Optional<User> findByUsername(@NotNull String username);
}
