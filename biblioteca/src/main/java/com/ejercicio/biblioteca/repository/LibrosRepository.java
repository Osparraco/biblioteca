package com.ejercicio.biblioteca.repository;

import com.ejercicio.biblioteca.entity.Libros;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrosRepository extends CrudRepository<Libros, Integer> {



}
