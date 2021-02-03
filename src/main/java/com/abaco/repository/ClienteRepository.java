package com.abaco.repository;


import java.util.List;

import com.abaco.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String >{

	public List<Cliente> findByCedula(String cedula);
	
}
