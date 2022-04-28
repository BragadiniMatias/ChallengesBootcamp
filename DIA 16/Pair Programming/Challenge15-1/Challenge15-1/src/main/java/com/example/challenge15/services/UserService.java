package com.example.challenge15.services;

import org.springframework.stereotype.Service;

import com.example.challenge15.model.UserModel;
import com.example.challenge15.repository.UserRepository;

@Service
public class UserService {
	
	UserRepository userRepo;
	
	public UserModel insertUser(UserModel user) {
		return userRepo.save(user);
	}
	
	public UserModel getUserByDni(long dni) {
		return userRepo.getById(dni);
	}
	
	public boolean deleteUser(long dni) {
		if(userRepo.existsById(dni)) {
			userRepo.deleteById(dni);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean updateUser(UserModel user) {
		if(userRepo.existsById(user.getDni())) {
			UserModel userUpd = userRepo.getById(user.getDni());
			userUpd.setNombre(user.getNombre());
			userUpd.setApellido(user.getApellido());
			userUpd.setDireccion(user.getDireccion());
			userRepo.save(userUpd);
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
