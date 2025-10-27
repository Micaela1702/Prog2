package Coleccionables.Condiciones;

import Coleccionables.Figurita;

public class CondicionPrecio extends Buscador{
    private double precio;

    public CondicionPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Figurita figurita) {
        return figurita.calcularPrecio() < precio;
    }
}
