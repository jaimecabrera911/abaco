package com.abaco.service;


import com.abaco.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CuentaService {

    public List<Cuenta> listarTodo();
    public List<Cuenta> listarPorNumeroCuenta();
}
