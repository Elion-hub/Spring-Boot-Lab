package com.corporativoX.cursoSpringB.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatingRestController {

    @GetMapping({"/saludo/{name}","/hola/{name}"})
    public String greeting(@PathVariable String name){
        return "Hola " + name;

    }
}
