package Aseguradora.Calculadores;

import Aseguradora.Cartera;

public class CalculadorPorcentaje extends CalcularCosto{
    private double porcentaje;

    public CalculadorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularPoliza(Cartera cartera) {
        return cartera.getMontoAsegurado() * 100 / porcentaje;
    }
}
