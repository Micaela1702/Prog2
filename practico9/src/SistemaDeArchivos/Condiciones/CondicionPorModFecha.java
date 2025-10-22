package SistemaDeArchivos.Condiciones;
import SistemaDeArchivos.ElementoSA;

import java.time.LocalDate;


public class CondicionPorModFecha extends Buscador {
    private final LocalDate fechaSolicitada = LocalDate.of(2020, 10, 15);

    @Override
    public boolean cumple(ElementoSA elementoSA) {
        return elementoSA.getFechaCreacion().isAfter(fechaSolicitada);
    }
}
