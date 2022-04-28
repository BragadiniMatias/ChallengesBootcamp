package com.example.challenge15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.challenge15.model.UserModel;
import com.example.challenge15.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	UserService userServ;
	
	@PostMapping
	public UserModel insertUser(@RequestBody UserModel user){
		
		return userServ.insertUser(user);
	}
	
	@GetMapping("/{dni}")
	public UserModel getUser(@PathVariable("dni") int dni) {
		return userServ.getUserByDni(dni);
	}
	
	@PutMapping()
	public String updateUser(@RequestBody UserModel user) {

		if(userServ.updateUser(user)) {
			return "Update correcto";
		} else {
			return "Error: No updateaste";
		}
	}
	
	@DeleteMapping("/{dni}")
	public void deleteUser(@PathVariable("dni") int dni) {
		userServ.deleteUser(dni);
	}
	
}
