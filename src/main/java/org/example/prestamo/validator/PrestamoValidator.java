package org.example.prestamo.validator;

import lombok.Getter;
import lombok.Setter;
import org.example.prestamo.model.DetallePrestamo;
import org.openxava.util.Messages;
import org.openxava.validators.IValidator;

import java.util.Collection;

@Getter
@Setter
public class PrestamoValidator implements IValidator {

    private Collection<DetallePrestamo> detalle;
    @Override
    public void validate(Messages messages) throws Exception {
        if (detalle.size() > 3) {
            messages.add("Solo se puede prestar 3 libros");
        }
    }
}
