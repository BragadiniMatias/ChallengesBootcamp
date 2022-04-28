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

import com.example.challenge15.model.FacturaModel;
import com.example.challenge15.services.FacturaService;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {
	
	@Autowired
	FacturaService facServ;
	
	@PostMapping
	public FacturaModel insertFac(@RequestBody FacturaModel fac){
		
		return facServ.insertFactura(fac);
	}
	
	@GetMapping("/{nroFactura}")
	public FacturaModel getFac(@PathVariable("nroFactura") long nroFactura) {
		return facServ.getUserByNroFactura(nroFactura);
	}
	
	@PutMapping()
	public String updateFac(@RequestBody FacturaModel fac) {

		if(facServ.updateFactura(fac)) {
			return "Update correcto";
		} else {
			return "Error: No updateaste";
		}
	}
	
	@DeleteMapping("/{nroFactura}")
	public void deleteFac(@PathVariable("nroFactura") long nroFactura) {
		facServ.deleteFactura(nroFactura);
	}
	
}
