package com.ejercicio.biblioteca.service;


import com.ejercicio.biblioteca.entity.Libros;
import com.ejercicio.biblioteca.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class LibrosService {
    @Autowired
    LibrosRepository librosRepository;

    public ArrayList<Libros> getLibros(Object librosId){
        ArrayList<Libros> value = new ArrayList<>();
        value = (ArrayList<Libros>)librosRepository.findAll();
        return value;
    }

    public Libros getAutorById(Integer librosId){
        Libros value = new Libros();
        value = (Libros)librosRepository.findById(librosId).orElse(new Libros());
        return value;
    }
    public void saveOrUpdate(Libros libros){
        librosRepository.save(libros);

    }
    public void delete(Integer id){
        librosRepository.deleteById(id);
    }

    public ArrayList<Libros> getAll() {
        return (ArrayList<Libros>)librosRepository.findAll ();
    }
}
