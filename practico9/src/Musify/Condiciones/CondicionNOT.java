package Musify.Condiciones;

import Musify.PistaDeMusica;

public class CondicionNOT extends Buscador {
    private Buscador condicion;

    public CondicionNOT(Buscador condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(PistaDeMusica pistaDeMusica) {
        return !condicion.cumple(pistaDeMusica);
    }
}
