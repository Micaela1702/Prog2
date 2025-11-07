package SistemaDeArchivos.Condiciones;

import SistemaDeArchivos.ElementoSA;

import java.time.LocalDate;

public class CondicionPorFecha extends Buscador{


    @Override
    public boolean cumple(ElementoSA elementoSA) {
        LocalDate fechaRequerida= LocalDate.of(2020, 10, 15);
        return elementoSA.getFechaCreacion().isAfter(fechaRequerida);
    }
}
