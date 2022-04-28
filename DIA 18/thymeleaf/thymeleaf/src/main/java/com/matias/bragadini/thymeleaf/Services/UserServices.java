package com.matias.bragadini.thymeleaf.Services;

import com.matias.bragadini.thymeleaf.model.User;
import com.matias.bragadini.thymeleaf.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository ur;

    public List<User> getAllUsers() {
        return ur.findAll();
    }

    public User getOneUser(int id){
        return ur.getById(id);
    }


    public User saveUser(User user) {
        return ur.save(user);

    }

    public void deleteUser(User us){
        ur.delete(us);
    }

}