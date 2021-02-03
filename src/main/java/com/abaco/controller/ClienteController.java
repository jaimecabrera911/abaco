package com.abaco.controller;

import com.abaco.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abaco.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/")
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteService.listarTodo());
        return "vistas/clientes/lista";
    }

    @PostMapping("/guardar")
    public String guardarCliente(Cliente cliente) {
        System.out.println("cliente = " + cliente);
        clienteService.guardar(cliente);
        return "redirect:/clientes/";
    }

}
