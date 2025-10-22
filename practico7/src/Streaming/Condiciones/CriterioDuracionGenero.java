package Streaming.Condiciones;

import Streaming.Pelicula;

public class CriterioDuracionGenero extends CriterioRentabilidad {
    private double duracionMax;
    private String generoExcluido;

    public CriterioDuracionGenero(double duracionMax, String generoExcluido) {
        this.duracionMax = duracionMax;
        this.generoExcluido = generoExcluido.toLowerCase();
    }

    @Override
    public boolean esRentable(Pelicula pelicula) {
        return pelicula.getDuracion() < duracionMax &&
                !pelicula.getGenero().equalsIgnoreCase(generoExcluido);
    }
}