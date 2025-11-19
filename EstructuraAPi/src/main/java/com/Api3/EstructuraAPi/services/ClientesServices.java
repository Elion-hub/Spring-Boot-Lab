package com.Api3.EstructuraAPi.services;


import com.Api3.EstructuraAPi.models.Clientes;
import com.Api3.EstructuraAPi.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServices {

    @Autowired
    private ClientesRepository repository;

    public List<Clientes> listarClientes(){

        return repository.findAll();
    }

    public Clientes guardar(Clientes c){
        return repository.save(c);
    }

    public Optional<Clientes> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
    public List<Clientes> guardarVarios(List<Clientes> clientes) {
        return repository.saveAll(clientes);
    }
}
