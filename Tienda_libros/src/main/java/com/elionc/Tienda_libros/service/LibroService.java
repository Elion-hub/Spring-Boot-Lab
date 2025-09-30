package com.elionc.Tienda_libros.service;

import com.elionc.Tienda_libros.models.Libro;
import com.elionc.Tienda_libros.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private LibroRepository libroRepositorio;


    @Override
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro buscarLibroPorID(Integer idLibro) {
        Libro libro = libroRepositorio.findById(idLibro).orElse(null);
        return libro;

    }

    @Override
    public void guardarLibro(Libro libro) {

        libroRepositorio.save(libro);

    }

    @Override
    public void eliminarLibro(Libro libro) {

        libroRepositorio.delete(libro);
    }
}
