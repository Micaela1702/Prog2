package Aseguradora.Calculadores;

import Aseguradora.Cartera;

public class CalculadorMontoFijo extends CalcularCosto{
    private double montoFijo;

    public CalculadorMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double calcularPoliza(Cartera cartera) {
        return montoFijo;
    }
}
