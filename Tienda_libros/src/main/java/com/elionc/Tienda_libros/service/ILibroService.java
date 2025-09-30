package com.elionc.Tienda_libros.service;

import com.elionc.Tienda_libros.models.Libro;

import java.util.List;

public interface ILibroService {
    public List<Libro> listarLibros();

    public Libro buscarLibroPorID(Integer idLibro);

    public void guardarLibro(Libro libro);

    public void eliminarLibro(Libro libro);

}
