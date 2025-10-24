package Aseguradora.Calculadores;

import Aseguradora.Cartera;

public class CalculadorSuma extends CalcularCosto{
    private CalcularCosto cond1, cond2;

    public CalculadorSuma(CalcularCosto cond1, CalcularCosto cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public double calcularPoliza(Cartera cartera) {
        return cond1.calcularPoliza(cartera) + cond2.calcularPoliza(cartera);
    }
}
