package Musify;

import Musify.Condiciones.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;

public class PistaParaTodos extends PistaDeMusica {
    public PistaParaTodos(String titulo, int ID_musica, double duracion, String artista, String tituloAlbum, LocalDate anio, String genero) {
        super(titulo, ID_musica, duracion, artista, tituloAlbum, anio, genero);
    }


    @Override
    public ArrayList<PistaDeMusica> buscar(Buscador condicion) {
        ArrayList<PistaDeMusica> resultado = new ArrayList<>();
        resultado.add(this);
        return resultado;
    }
}
