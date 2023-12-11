package com.ejercicio.biblioteca.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer autorId;
    private String nombre;
    private String nacionalidad;
    private Date fechaNacimiento;


    public Integer getautorId() {
        return autorId;
    }

    public void setautorId(Integer autorId) {
        this.autorId = autorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnacionalidad() {
        return nacionalidad;
    }

    public void setnacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public Date getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}


