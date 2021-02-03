package com.abaco.controller;

import com.abaco.model.Cuenta;
import com.abaco.service.ClienteService;
import com.abaco.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cuentas")
public class CuentaController {

    @Autowired
    CuentaService cuentaService;
    
    @Autowired
    ClienteService clienteService;

    @GetMapping("/")
    public String listarCuentas(Model model){
        model.addAttribute("cuentas",cuentaService.listarTodo());
        return "vistas/cuentas/lista";
    }
    
    @GetMapping("/formulario")
    public String crearCuenta(Cuenta cuenta, Model model) {
    	model.addAttribute("clientes",clienteService.listarTodo());
		return "vistas/cuentas/formulario";
    }
    
    @PostMapping("/guardar")
    public String guardarCuenta(Cuenta cuenta) {
    	cuentaService.guardar(cuenta);
    	return "redirect:/cuentas/";
    }

}	
