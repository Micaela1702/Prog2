package Musify;

import Musify.Condiciones.Buscador;

import java.util.ArrayList;

public class PlayListPromocionada extends Playlist {
    private PistaDeMusica pistaPromocionada;

    public PlayListPromocionada(String nombre) {
        super(nombre);
    }

    @Override
    public ArrayList<PistaDeMusica> buscar(Buscador condicion){
        ArrayList<PistaDeMusica> promocionada = super.buscar(condicion);
        promocionada.add(pistaPromocionada); // se incluye siempre, sin importar la condición
        return promocionada;
    }
}
