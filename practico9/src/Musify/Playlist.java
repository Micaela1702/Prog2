package Musify;

import java.util.ArrayList;

public class Playlist extends Archivo {
    ArrayList<Archivo> Playlist;

    public Playlist(String titulo) {
        super(titulo);
        this.Playlist = new ArrayList<>();

    }

    public void agregarElemento(Archivo pista) {
       Playlist.add(pista);

    }

    @Override
    public double getDuracion() {
        double duracionTotal = 0;
        for (Archivo archivo : Playlist) {
            duracionTotal += archivo.getDuracion();
        }
        return duracionTotal;
    }

    public ArrayList<PistaDeMusica> buscar(Buscador condicion) {
        ArrayList<PistaDeMusica> resultado = new ArrayList<>();
        for (Archivo archivo : Playlist) {
            if (archivo instanceof PistaDeMusica) {
                PistaDeMusica pista = (PistaDeMusica) archivo; // a archivo lo trato como pista de música
                // Si es PistaParaTodos, se incluye siempre. Si no, se evalúa la condición.
                if (pista instanceof PistaParaTodos || condicion.cumple(pista)) {
                    resultado.add(pista);
                }
            } else if (archivo instanceof Playlist) {
                Playlist subPlaylist = (Playlist) archivo; // a archivo lo trato como playlist
                resultado.addAll(subPlaylist.buscar(condicion)); // agrego a la lista, las playlist que cumplen con la condicion.
                // se llama recursivamente a buscar si el elemento es otra playlist.
            }
        }
        return resultado;
    }
}
