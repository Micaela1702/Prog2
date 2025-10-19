package SistemaDeArchivos;

import java.time.LocalDate;

public class AccesoDirecto extends ElementoSA {
    private final static double tamanio = 1.00;

    public AccesoDirecto(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
    }

    @Override
    public double calcularTamanio() {
        return tamanio;
    }
}
