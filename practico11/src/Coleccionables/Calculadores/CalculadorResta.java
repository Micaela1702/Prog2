package Coleccionables.Calculadores;

import Coleccionables.FiguritaLimitada;

public class CalculadorResta extends CalculadorFigurita{

    @Override
    public double calcularPrecio(FiguritaLimitada limitada) {
        return 100 - limitada.getCantidadDisponibles();
    }
}
