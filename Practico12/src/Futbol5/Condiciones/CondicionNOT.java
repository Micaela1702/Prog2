package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionNOT extends Condicion{
    private Condicion condicion;

    public CondicionNOT(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Socio socio) {
        return !condicion.cumple(socio);
    }
}
