package com.example.pairProgramming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pairProgramming.model.Factura;

@Service
public class FacturaService {
	
	@Autowired
	private FacturaRepository cr;
	
	public List<Factura> getAll(){
		return cr.findAll();
	}
	
	public Factura getCelular(long dni) {
		return cr.getById(dni);
	}
	
	public void insert(Factura factura) {
		cr.save(factura);
	}

	public void delete(long dni) {
		cr.deleteById(dni);
	}
	
	public void update(Factura factura) {
		
	}
}
