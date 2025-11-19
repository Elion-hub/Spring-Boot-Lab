package com.Api3.EstructuraAPi.repository;


import com.Api3.EstructuraAPi.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository  extends JpaRepository<Clientes, Long> {
}
