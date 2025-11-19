package com.elionc.GestorTareas.repository;


import com.elionc.GestorTareas.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

//2
public interface TareaRepository  extends JpaRepository<Tarea, Integer> {
}
