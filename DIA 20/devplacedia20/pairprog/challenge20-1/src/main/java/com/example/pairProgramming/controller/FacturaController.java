package com.example.pairProgramming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.pairProgramming.model.Celular;
import com.example.pairProgramming.model.Factura;

@Controller
@RequestMapping("/facturas")
public class FacturaController {
	
	@Autowired
	private FacturaService facS;
	
	@Autowired
	private CelularService celS;

	@GetMapping("/comprar/{id}")
	public String getfacturaForm(Model model, @PathVariable("id") long id) {
	Factura fac = new Factura();
	fac.setIdCelular(id);
	model.addAttribute("factura", fac);
	return "comprarForm";
	}
	
	@PostMapping("/comprar")
	public String createTicket(RedirectAttributes ra,@ModelAttribute("factura") Factura factura) {
		ra.addFlashAttribute("factura",factura);
		return "redirect:/facturas";
	}
	
	@GetMapping
	public String generaTicket(Model model, @ModelAttribute Factura fac ) {
		facS.insert(fac);
		Celular cel = celS.getCelular(fac.getIdCelular());
		model.addAttribute("factura", fac);
		model.addAttribute("celular", cel);
		return "ticketView";
	}
	
	
	

	
	
}
