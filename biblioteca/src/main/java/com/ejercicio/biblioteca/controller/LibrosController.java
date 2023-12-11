package com.ejercicio.biblioteca.controller;


import com.ejercicio.biblioteca.entity.Libros;
import com.ejercicio.biblioteca.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping(path= "api/V1/libros")
public class LibrosController {
    @Autowired
    private LibrosService LibrosService = null;



    @GetMapping("/LibrosId/{LibrosId}")
    public ArrayList<Libros> getBId(@PathVariable("LibrosId")Integer librosId){
        Object LibrosId = null;
        return LibrosService.getLibros(librosId);
    }

    @GetMapping("")
    public ArrayList<Libros> getAll(){
        Object LibrosId = null;
        return LibrosService.getAll();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Libros libros){
         LibrosService.saveOrUpdate(libros);
    }

    @DeleteMapping("{LibrosId}")
    public void saveDelete(@PathVariable("librosId") Integer librosId){

        LibrosService.delete(librosId);
    }
}

