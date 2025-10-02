package com.elionc.ApiRest2.repositories;

import com.elionc.ApiRest2.models.PokemonsModels;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PokemonsRepository extends CrudRepository<PokemonsModels, Long> {
    public abstract ArrayList<PokemonsModels> findByNivel(Integer nivel);

}
