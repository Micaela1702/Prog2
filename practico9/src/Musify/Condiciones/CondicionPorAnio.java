package Musify.Condiciones;


import Musify.PistaDeMusica;

public class CondicionPorAnio extends Buscador {
    private final static int anioSolicitado = 1985;

    @Override
    public boolean cumple(PistaDeMusica pistaDeMusica) {
        return pistaDeMusica.getAnio().getYear() == anioSolicitado;
    }
}
