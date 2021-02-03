package com.abaco.service;

import com.abaco.model.Cliente;

import java.util.List;


public interface ClienteService {
	public List<Cliente> listarTodo();

	public void guardar(Cliente cliente);
	
}
