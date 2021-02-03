package com.abaco.controller;

import com.abaco.model.Cuenta;
import com.abaco.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cuentas")
public class CuentaController {

    @Autowired
    CuentaService cuentaService;

    @GetMapping("/")
    public String listarCuentas(Model model){
        model.addAttribute("cuentas",cuentaService.listarTodo());
        return "vistas/cuentas/lista";
    }

}
