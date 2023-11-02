package org.example.prestamo.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
@EntityValidator(
        value=org.example.prestamo.validator.PrestamoValidator.class,
        properties = {
                @PropertyValue(name="detalle")
        }
)
@View(members ="datosPrestamo[fechaPrestamo,fechaEntrega;" +
        "estudiante];detalle")
public class Prestamo extends ID{

    private LocalDate fechaPrestamo;

    private LocalDate fechaEntrega;

    @ManyToOne(fetch = FetchType.LAZY)
    @ReferenceView("simple")
    private Estudiante estudiante;

    @ElementCollection
    @ListProperties("libro.id,libro.nombre,libro.autor.nombre")
    private Collection<DetallePrestamo> detalle;

}
