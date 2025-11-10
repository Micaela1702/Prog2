package Electronica.Condiciones;

import Electronica.ElementoP;

public class CondicionOferta extends Condicion{
    private double valor;

    public CondicionOferta(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean cumple(ElementoP elemento) {
        return elemento.getValor() < valor;
    }
}
