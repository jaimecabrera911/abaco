package com.abaco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abaco.model.PruebaCuenta;
import com.abaco.repository.PruebaCuentaRepository;

@Service
public class PruebaCuentaServiceImp implements PruebaCuentaService{

	@Autowired
	PruebaCuentaRepository pruebaCuentaRepository;
	
	@Override
	public List<PruebaCuenta> listarTodo() {
		
		return pruebaCuentaRepository.findAll();
	}

	@Override
	public void guardar(PruebaCuenta pruebaCuenta) {
		pruebaCuentaRepository.save(pruebaCuenta);
	}

}
