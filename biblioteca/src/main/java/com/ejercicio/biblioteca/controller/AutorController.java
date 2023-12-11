package com.ejercicio.biblioteca.controller;

import com.ejercicio.biblioteca.entity.Autor;
import com.ejercicio.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path= "api/V1/autor")
public class AutorController {
    @Autowired
    private AutorService autorService ;

    @GetMapping
    public ArrayList<Autor> getAutor(){
        return (ArrayList<Autor>)autorService.getAutor();
    }

    @GetMapping("/autorId/{autorId}")
    public Autor getBId(@PathVariable("autorId")Integer autorId){
        return autorService.getAutorById(autorId);
    }

    @PostMapping
    public Autor saveUpdate(@RequestBody Autor autor){
        return autorService.saveOrUpdate(autor);
    }

    @DeleteMapping("{autorId}")
    public void saveDelete(@PathVariable("autorId") Integer autorId){

        autorService.delete(autorId);
    }




}
