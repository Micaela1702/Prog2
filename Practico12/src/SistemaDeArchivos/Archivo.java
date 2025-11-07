package SistemaDeArchivos;

import SistemaDeArchivos.Condiciones.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;

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

    public ArrayList<ElementoSA> buscar(Buscador condicion) {
        return super.buscar(condicion);
    }
}
