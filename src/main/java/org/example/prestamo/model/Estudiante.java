package org.example.prestamo.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.File;
import org.openxava.annotations.ListProperties;
import org.openxava.annotations.View;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Collection;

@Entity
@Getter
@Setter
@View(name="simple",members = "primerNombre,primerApellido")
public class Estudiante extends ID{

    private String primerNombre;

    private String primerApellido;

    @File
    @Column(length = 32)
    private String foto;

    @ElementCollection
    @ListProperties("nombreBarrio,direccion,municipio.nombre")
    private Collection<Direccion> direcciones;
}
