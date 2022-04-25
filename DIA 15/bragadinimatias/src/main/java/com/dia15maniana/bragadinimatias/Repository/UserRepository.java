package com.dia15maniana.bragadinimatias.Repository;

import com.dia15maniana.bragadinimatias.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByEmail(String email);
}
