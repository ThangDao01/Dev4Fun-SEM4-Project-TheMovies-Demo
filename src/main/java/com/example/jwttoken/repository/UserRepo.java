package com.example.jwttoken.repository;

import com.example.jwttoken.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUsername(String username);
}
