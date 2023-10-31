package org.example.prestamo.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Libro extends ID{

    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private Autor autor;
}
