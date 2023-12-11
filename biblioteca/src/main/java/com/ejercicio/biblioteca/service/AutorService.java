package com.ejercicio.biblioteca.service;

import com.ejercicio.biblioteca.entity.Autor;
import com.ejercicio.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AutorService {
    @Autowired
    AutorRepository autorRepository;
    public ArrayList<Autor> getAutor(){
        ArrayList<Autor> value = new ArrayList<Autor>();
        value = (ArrayList<Autor>)autorRepository.findAll();
        return value;
    }


    public Autor getAutorById(Integer autorId){
        Autor value = new Autor();
        value = (Autor)autorRepository.findById(autorId).orElse(new Autor());
        return value;
    }
    public Autor saveOrUpdate(Autor autor){
        autorRepository.save(autor);
        return autor;
    }
    public void delete(Integer id){
        autorRepository.deleteById(id);
    }








}
