package com.ejercicio.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table(name = "libros")
public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer libroId;
    private String titulo;
    private Date publicacionDate;
    private Long autorId;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getLibroId() {
        return libroId;
    }

    public Date getPublicacionDate() {
        return publicacionDate;
    }

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }

    public void setPublicaciónDate(Date publicaciónDate) {
        this.publicacionDate = publicaciónDate;
    }

    public void setLibroId(Integer libroId) {
        this.libroId = libroId;
    }
}
