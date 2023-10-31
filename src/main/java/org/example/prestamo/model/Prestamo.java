package org.example.prestamo.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ListProperties;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
public class Prestamo extends ID{

    private LocalDate fechaPrestamo;

    private LocalDate fechaEntrega;

    @ManyToOne(fetch = FetchType.LAZY)
    private Estudiante estudiante;

    @ElementCollection
    @ListProperties("detalle.id,libro.nombre,libro.autor")
    private Collection<DetallePrestamo> detalle;

}
