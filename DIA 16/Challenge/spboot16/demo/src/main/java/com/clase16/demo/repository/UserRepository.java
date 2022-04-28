package com.clase16.demo.repository;

import com.clase16.demo.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

    UserModel findByUsername(String username);

}

