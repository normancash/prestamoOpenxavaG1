package org.example.prestamo.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
@Getter
@Setter
public class Direccion {

    private String nombreBarrio;

    private String direccion;

    @ManyToOne
    @DescriptionsList
    private Municipio municipio;
}
