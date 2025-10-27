package Coleccionables.Calculadores;

import Coleccionables.FiguritaLimitada;

public class CalculadorMultiplicacion extends CalculadorFigurita{
    private double precioFijo;

    public CalculadorMultiplicacion(double precioFijo) {
        this.precioFijo = precioFijo;
    }

    @Override
    public double calcularPrecio(FiguritaLimitada limitada) {
        return precioFijo * 1000 * limitada.getCantidadDisponibles();
    }
}
