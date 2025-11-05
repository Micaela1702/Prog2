package Parcial.Condicion;

import Parcial.Vendedor;

public class CondicionNOT extends Condicion{
    private Condicion condicion;

    public CondicionNOT(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Vendedor vendedor) {
        return !condicion.cumple(vendedor);
    }
}
