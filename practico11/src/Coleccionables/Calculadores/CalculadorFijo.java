package Coleccionables.Calculadores;

import Coleccionables.FiguritaLimitada;

public class CalculadorFijo extends CalculadorFigurita{
    private double precioFijo;

    public CalculadorFijo(double precioFijo) {
        this.precioFijo = precioFijo;
    }

    @Override
    public double calcularPrecio(FiguritaLimitada limitada) {
        return precioFijo;
    }
}
