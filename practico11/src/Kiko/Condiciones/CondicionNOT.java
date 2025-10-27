package Kiko.Condiciones;

import Kiko.ComandoSimple;

public class CondicionNOT extends Buscador{
    private Buscador condicion;

    public CondicionNOT(Buscador condicion) {
        this.condicion = condicion;
    }


    @Override
    public boolean cumple(ComandoSimple comandoSimple) {
        return !condicion.cumple(comandoSimple);
    }
}
