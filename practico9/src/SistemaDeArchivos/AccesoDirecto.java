package SistemaDeArchivos;

import java.time.LocalDate;

public class AccesoDirecto extends ElementoSA{

    private double TAMANIOFIJO=1.00;

    public AccesoDirecto(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
    }

    @Override
    public double calcularTamanio() {
        return TAMANIOFIJO;
    }


}
