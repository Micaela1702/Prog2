package SistemaDeArchivos;

import SistemaDeArchivos.Condiciones.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Archivo extends ElementoSA {
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
