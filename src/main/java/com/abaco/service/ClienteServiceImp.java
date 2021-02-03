package com.abaco.service;

import java.util.List;

import com.abaco.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abaco.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarTodo() {
        return clienteRepository.findAll();
    }

    @Override
    public void guardar(Cliente cliente) {
        clienteRepository.save(cliente);
    }


}
