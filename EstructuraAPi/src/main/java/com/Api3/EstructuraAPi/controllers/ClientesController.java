package com.Api3.EstructuraAPi.controllers;


import com.Api3.EstructuraAPi.models.Clientes;
import com.Api3.EstructuraAPi.repository.ClientesRepository;
import com.Api3.EstructuraAPi.services.ClientesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesServices services;

    @GetMapping
    public List<Clientes> listar() {
        return services.listarClientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> obtener(@PathVariable Long id) {

        return services.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Clientes crear(@RequestBody Clientes clientes){

        return services.guardar(clientes);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Clientes> actualizar(@PathVariable Long id, @RequestBody Clientes clientes){
        return services.buscarPorId(id).map(existe->{
            clientes.setId(id);
            return ResponseEntity.ok(services.guardar(clientes));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        services.eliminar(id);
    }

    @PostMapping("/bulk")
    public ResponseEntity<List<Clientes>> guardaBulk(@RequestBody List<Clientes> clientes) {
        List<Clientes> guardados = services.guardarVarios(clientes);
        return ResponseEntity.ok(guardados);
    }


}
