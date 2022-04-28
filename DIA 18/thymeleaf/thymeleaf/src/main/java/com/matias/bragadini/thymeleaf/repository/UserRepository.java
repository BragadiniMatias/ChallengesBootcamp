package com.matias.bragadini.thymeleaf.repository;


import com.matias.bragadini.thymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{
    public boolean existsByUsername(String name);


}
