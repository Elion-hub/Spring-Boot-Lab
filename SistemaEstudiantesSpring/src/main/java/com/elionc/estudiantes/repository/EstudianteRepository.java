package com.elionc.estudiantes.repository;

import com.elionc.estudiantes.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
