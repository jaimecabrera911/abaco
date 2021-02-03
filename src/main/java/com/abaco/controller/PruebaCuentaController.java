package com.abaco.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abaco.model.PruebaCuenta;
import com.abaco.service.PruebaCuentaService;

@Controller
@RequestMapping("/transacciones")
public class PruebaCuentaController {
	
	@Autowired
	PruebaCuentaService pruebaCuentaService;

	@GetMapping("/")
	public String listarTransacciones(Model model) {
		model.addAttribute("transacciones",pruebaCuentaService.listarTodo());
		return "/vistas/pruebaCuenta/lista";	
	}
	
	@PostMapping("/guardar")
	public String guardar(PruebaCuenta pruebaCuenta) {
		pruebaCuentaService.guardar(pruebaCuenta);
		return "redirect:/transacciones/";
	}
}
