package Aseguradora.Condiciones;

import Aseguradora.SeguroSimple;

public class CondicionNOT extends Buscador {

    private Buscador condicion;

    public CondicionNOT(Buscador condicion){
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(SeguroSimple seguroSimple) {
        return !condicion.cumple(seguroSimple);
    }
}
