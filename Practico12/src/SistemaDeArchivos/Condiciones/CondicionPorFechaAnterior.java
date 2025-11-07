package SistemaDeArchivos.Condiciones;

import SistemaDeArchivos.ElementoSA;

import java.time.LocalDate;

public class CondicionPorFechaAnterior extends Buscador{
    @Override
    public boolean cumple(ElementoSA elementoSA) {
        LocalDate fechaSolicitada= LocalDate.of(2020, 3, 15);
        return elementoSA.getFechaCreacion().isBefore(fechaSolicitada);
    }
}
