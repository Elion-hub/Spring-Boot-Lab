package com.elionc.ApiRest2.services;


import com.elionc.ApiRest2.models.PokemonsModels;
import com.elionc.ApiRest2.repositories.PokemonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PokemonsService {

    @Autowired
    PokemonsRepository pokemonsRepository;

    public ArrayList<PokemonsModels> obtenerPokemon(){
        return (ArrayList<PokemonsModels>) pokemonsRepository.findAll();
    }

    public PokemonsModels guardarPokemon(PokemonsModels pokemon){
        return pokemonsRepository.save(pokemon);

    }

    public Optional<PokemonsModels> obtenerPorId(Long id){
        return pokemonsRepository.findById(id);

    }
    public ArrayList<PokemonsModels> obtenerPorNivel(Integer nivel){
        return pokemonsRepository.findByNivel(nivel);
    }
    public boolean eliminarPokemon(Long id){

        try {
            pokemonsRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public ArrayList<PokemonsModels> guardarPokemons(ArrayList<PokemonsModels> pokemons){
        return (ArrayList<PokemonsModels>) pokemonsRepository.saveAll(pokemons);
    }
}
