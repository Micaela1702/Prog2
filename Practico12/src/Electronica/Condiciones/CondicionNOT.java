package Electronica.Condiciones;

import Electronica.ElementoP;

public class CondicionNOT extends Condicion {
    private Condicion condicion;

    public CondicionNOT(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(ElementoP elemento) {
        return !condicion.cumple(elemento);
    }
}
