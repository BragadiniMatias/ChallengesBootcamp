package com.matias.bragadini.thymeleaf.controllers;

import com.matias.bragadini.thymeleaf.Services.UserServices;
import com.matias.bragadini.thymeleaf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices us;

    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("users", us.getAllUsers());
        return "users";
    }

    @GetMapping("/create")
    public String showFormUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "createUser";
    }


    @PostMapping("/create")
    public String saveUser(@ModelAttribute("user") User user){
        if (user.getId() == 0) us.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, Model model){
        User user = us.getOneUser(id);
        model.addAttribute("user", user);
        return "update_user";
    }

    @PostMapping("/update/{id}")
    public String updateUpser(@ModelAttribute("user") User user){
        us.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, User user){
        us.deleteUser(user);
        return "redirect:/users";
    }


}
