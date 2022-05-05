package com.example.pairProgramming.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pairProgramming.controller.repositories.InscriptionRepository;
import com.example.pairProgramming.model.Inscription;

@Service
public class InscriptionService {

//	@Autowired
//	private InscriptionRepository ir;
//
//	public void insertInscription(Inscription i) {
//		InscriptionId id = new InscriptionId(i.getCode(),i.getDni());
//		if(!ir.existsById(id)) {
//			ir.save(i);
//		}
//	}
//
//	public void deleteInscription(InscriptionId id) {
//		if(ir.existsById(id)) {
//			ir.deleteById(id);
//		}
//	}
//
//	public List<Inscription> getAll(){
//		return ir.findAll();
//	}
//
//	public Inscription getInscription(InscriptionId id) {
//		return ir.getById(id);
//	}
//
//	public boolean updateInscription(Inscription i) {
//		InscriptionId id = new InscriptionId(i.getCode(),i.getDni());
//		if(!ir.existsById(id)) {
//			return false;
//		} else {
//			ir.save(i);
//			return true;
//		}
//	}
//}
}
