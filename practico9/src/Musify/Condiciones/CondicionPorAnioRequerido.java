package Musify.Condiciones;


import Musify.PistaDeMusica;

public class CondicionPorAnioRequerido extends Buscador {
    private int anioSolicitado;

    public CondicionPorAnioRequerido(int anioSolicitado) {
        this.anioSolicitado = anioSolicitado;
    }

    @Override
    public boolean cumple(PistaDeMusica pistaDeMusica) {
        return pistaDeMusica.getAnio().getYear() == anioSolicitado;
    }
}


