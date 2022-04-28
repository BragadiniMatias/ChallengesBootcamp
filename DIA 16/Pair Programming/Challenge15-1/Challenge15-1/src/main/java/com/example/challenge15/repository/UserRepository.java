package com.example.challenge15.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.challenge15.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>{

}
