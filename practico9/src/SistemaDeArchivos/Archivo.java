package SistemaDeArchivos;

import java.time.LocalDate;

public class Archivo extends ElementoSA{
    private double tamanio;

    public Archivo(String nombre, LocalDate fechaCreacion, double tamanio) {
        super(nombre, fechaCreacion);
        this.tamanio = tamanio;
    }

    @Override
    public double calcularTamanio() {
        return tamanio;
    }

}
