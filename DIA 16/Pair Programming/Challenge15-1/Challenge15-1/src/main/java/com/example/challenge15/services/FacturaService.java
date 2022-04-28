package com.example.challenge15.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.challenge15.model.FacturaModel;

import com.example.challenge15.repository.FacturaRepository;
import com.example.challenge15.repository.UserRepository;

@Service
public class FacturaService {
	
	@Autowired
	FacturaRepository facRepo;
	
	@Autowired
	UserRepository userRepo;
	
	public FacturaModel insertFactura(FacturaModel factura) {
		if(userRepo.existsById(factura.getCliente()))
			return facRepo.save(factura);
		else 
			return null;
	}
	
	public FacturaModel getUserByNroFactura(long nroFactura) {
		return facRepo.getById(nroFactura);
	}
	
	public boolean deleteFactura(long nroFactura) {
		if(facRepo.existsById(nroFactura)) {
			facRepo.deleteById(nroFactura);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean updateFactura(FacturaModel factura) {
		if(facRepo.existsById(factura.getNroFactura())) {
			FacturaModel facUpd = facRepo.getById(factura.getNroFactura());
			facUpd.setMonto(factura.getMonto());
			facRepo.save(facUpd);
			return true;
		} else {
			return false;
		}
	}
}
