package Musify.Condiciones;

import Musify.PistaDeMusica;

public class CondicionDuracion extends Buscador {
    private final static double duracionRequerida= 25.0;

    @Override
    public boolean cumple(PistaDeMusica pistaDeMusica) {
        return pistaDeMusica.getDuracion() > duracionRequerida;
    }
}
