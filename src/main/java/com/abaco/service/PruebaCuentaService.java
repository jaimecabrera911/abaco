package com.abaco.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abaco.model.PruebaCuenta;

@Service
public interface PruebaCuentaService {
	
	public List<PruebaCuenta> listarTodo();
	
	public void guardar(PruebaCuenta pruebaCuenta);

}
