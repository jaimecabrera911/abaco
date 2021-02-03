package com.abaco.service;

import com.abaco.model.Cuenta;
import com.abaco.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceImp implements CuentaService {

	@Autowired
	CuentaRepository cuentaRepository;

	@Override
	public List<Cuenta> listarTodo() {
		return cuentaRepository.findAll();
	}

	@Override
	public List<Cuenta> listarPorNumeroCuenta(String numeroCuenta) {
		return cuentaRepository.findByNumeroCuenta(numeroCuenta);
	}

	@Override
	public void guardar(Cuenta cuenta) {
		cuentaRepository.save(cuenta);
	}
}
