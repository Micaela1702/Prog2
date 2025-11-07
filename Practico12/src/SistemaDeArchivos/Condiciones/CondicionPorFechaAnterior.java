package SistemaDeArchivos.Condiciones;

import SistemaDeArchivos.ElementoSA;

import java.time.LocalDate;

public class CondicionPorFechaAnterior extends Buscador{
    private LocalDate fechaSolicitada;

    public CondicionPorFechaAnterior(LocalDate fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }

    @Override
    public boolean cumple(ElementoSA elementoSA) {
        return elementoSA.getFechaCreacion().isBefore(fechaSolicitada);
    }
}
