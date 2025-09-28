package com.elionc.estudiantes.service;

import com.elionc.estudiantes.models.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public List<Estudiante> listarEstudiantes();

    public Estudiante buscarEstudiantePorId(Integer idEstudiante);

    public void guardarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Estudiante estudiante);
}
