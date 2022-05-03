package com.example.pairProgramming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pairProgramming.model.Celular;

@Controller
@RequestMapping("/celulares")
public class CelularController {
	
	@Autowired
	private CelularService cs;
	
	@GetMapping
	public String getAll(Model model) {
		model.addAttribute("celulares", cs.getAll());
		return "index";
	}
	
	
}
