package org.example.prestamo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Municipio extends ID {

    private String nombre;

    private String descripcion;
}
