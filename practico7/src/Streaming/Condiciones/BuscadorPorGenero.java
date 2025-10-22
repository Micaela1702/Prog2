package Streaming.Condiciones;

import Streaming.Pelicula;

public class BuscadorPorGenero extends Buscador{
    private String genero;

    public BuscadorPorGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getGenero().contains(genero);
    }
}
