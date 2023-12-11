package com.ejercicio.biblioteca.repository;


import com.ejercicio.biblioteca.entity.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorRepository extends CrudRepository<Autor, Integer> {
}
