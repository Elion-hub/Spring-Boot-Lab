package com.elionc.GestorTareas.services;

import com.elionc.GestorTareas.models.Tarea;

import java.util.List;

//3


public interface ITareasService {
    public List<Tarea> listarTarea();

    public Tarea buscarTareaPorId(Integer idTarea);


    public void guardarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);

}
