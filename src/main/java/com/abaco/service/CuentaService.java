package com.abaco.service;


import com.abaco.model.Cuenta;

import java.util.List;

public interface CuentaService {

    public List<Cuenta> listarTodo();
    public List<Cuenta> listarPorNumeroCuenta(String cuentaRepository);
    public void guardar(Cuenta cuenta);
    
}
