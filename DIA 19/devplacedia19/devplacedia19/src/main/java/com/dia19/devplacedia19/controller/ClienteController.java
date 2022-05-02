package com.dia19.devplacedia19.controller;

import com.dia19.devplacedia19.model.Cliente;
import com.dia19.devplacedia19.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller //MVC = USO CONTROLLEr, API = RESTCONTROLLER.
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService cs;

    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("clientes", cs.getAllClients());
        return "ClientIndex";
    }

    //Aca voy a tener mis dos metodos para el add.
    //Un metodo get y otro post. uno es para el formulario
    //y el otro para mandar a bbdd.
    @GetMapping("/add")
    public String showFormUser(Model model){
        Cliente c = new Cliente();
        model.addAttribute("cliente", c);
        return "ClientCreate";
    }

    @PostMapping("/add")
    public String insertClient(@ModelAttribute("cliente") Cliente c){
        cs.insertClient(c);
        return "redirect:/clientes";
    }

    @GetMapping("/update/{dni}")
    public String showUpdateCliente(@PathVariable("dni") long dni, Model model){
        Cliente c = cs.findByDni(dni);
        model.addAttribute("cliente", c);
        return "updateCliente";
    }

    @PostMapping("/update/{dni}")
    public String updateCliente(@ModelAttribute("cliente") Cliente cl, @PathVariable("dni") long dni){
        cl.setDni(dni);
        cs.updateCliente(cl);
        return "redirect:/clientes";
    }

    @GetMapping("/delete/{dni}")
    public String deleteUser(@PathVariable("dni") long dni){
        cs.deleteUser(cs.findByDni(dni));
        return "redirect:/clientes";
    }


}
