package io.github.gabrielms.service;

import io.github.gabrielms.model.Cliente;
import io.github.gabrielms.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    private ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }
    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
