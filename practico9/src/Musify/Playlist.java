package Musify;

import Musify.Condiciones.Buscador;

import java.util.ArrayList;

public class Playlist extends Archivo {
    ArrayList<Archivo> Playlist;

    public Playlist(String titulo) {
        super(titulo);
        this.Playlist = new ArrayList<>();

    }

    public void agregarElemento(Archivo pista) {
        if(!Playlist.contains(pista)) {
            Playlist.add(pista);
        }
    }
    public void eliminarElemento(Archivo pistaAEliminar){
        Playlist.remove(pistaAEliminar);
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
           resultado.addAll(archivo.buscar(condicion));
        }
        return resultado;
    }
}
