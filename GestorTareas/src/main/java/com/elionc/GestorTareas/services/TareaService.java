package com.elionc.GestorTareas.services;


import com.elionc.GestorTareas.models.Tarea;
import com.elionc.GestorTareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//4

@Service
public class TareaService implements ITareasService{

    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public List<Tarea> listarTarea() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        Tarea tarea= tareaRepository.findById(idTarea).orElse(null);
        return tarea;
    }

    @Override
    public void guardarTarea(Tarea tarea) {
        tareaRepository.save(tarea);

    }

    @Override
    public void eliminarTarea(Tarea tarea) {
    tareaRepository.delete(tarea);
    }
}
