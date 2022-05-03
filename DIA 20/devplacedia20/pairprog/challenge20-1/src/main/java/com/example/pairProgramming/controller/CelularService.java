package com.example.pairProgramming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pairProgramming.model.Celular;

@Service
public class CelularService {
	
	@Autowired
	private CelularRepository cr;
	
	public List<Celular> getAll(){
		return cr.findAll();
	}
	
	public Celular getCelular(long id) {
		return cr.getById(id);
	}
	
	public void insert(Celular celular) {
		cr.save(celular);
	}

	public void delete(long id) {
		cr.deleteById(id);
	}
	
	public void update(Celular celular) {
		
	}
	
}
