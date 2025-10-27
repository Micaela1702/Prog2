package Coleccionables.Condiciones;

import Coleccionables.Figurita;

public class CondicionNOT extends Buscador{
    private Buscador condicion;

    public CondicionNOT(Buscador condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Figurita figurita) {
        return !condicion.cumple(figurita);
    }
}
