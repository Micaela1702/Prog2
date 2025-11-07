package SistemaDeArchivos.Condiciones;

import SistemaDeArchivos.ElementoSA;

import java.time.LocalDate;

public class CondicionPorFecha extends Buscador{
    private LocalDate fechaRequerida;

    public CondicionPorFecha(LocalDate fechaRequerida) {
        this.fechaRequerida = fechaRequerida;
    }

    @Override
    public boolean cumple(ElementoSA elementoSA) {
        return elementoSA.getFechaCreacion().isAfter(fechaRequerida);
    }
}
