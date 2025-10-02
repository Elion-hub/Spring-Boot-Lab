package com.elionc.ApiRest2.controllers;


import com.elionc.ApiRest2.models.PokemonsModels;
import com.elionc.ApiRest2.services.PokemonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/pokemons")
public class PokemonsController {

    @Autowired
    PokemonsService pokemonsService;

    @GetMapping
    public ArrayList<PokemonsModels> obtenerPokemon(){
        return pokemonsService.obtenerPokemon();
    }
    @PostMapping()
    public PokemonsModels guardarPokemon(@RequestBody PokemonsModels pokemon){
        return this.pokemonsService.guardarPokemon(pokemon);
    }

    @GetMapping(path = "/{id}")
    public Optional<PokemonsModels> obtenerPokemonPorId(@PathVariable("id") Long id){
        return this.pokemonsService.obtenerPorId(id);

    }

    @GetMapping("/query")
    public ArrayList<PokemonsModels> obtenerPokemonPorNivel(@RequestParam("nivel") Integer nivel){
        return this.pokemonsService.obtenerPorNivel(nivel);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.pokemonsService.eliminarPokemon(id);
        if (ok) {
            return "Se elimino al pokemon con id: " + id;
        }else {
            return "NO se elimino al pokemon con el id: " + id;
        }
    }
    @PostMapping("/bulk")
    public ArrayList<PokemonsModels> guardarPokemons(@RequestBody ArrayList<PokemonsModels> pokemons){
        return pokemonsService.guardarPokemons(pokemons);
    }

}



























