package Futbol5.Comparadores;

import Futbol5.Socio;

import java.util.Comparator;

public class ComparadorAlquiler implements Comparator<Socio> {
    private int idCancha;

    public ComparadorAlquiler(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.cantidadDeAlquileresPorCancha(idCancha) - socio2.cantidadDeAlquileresPorCancha(idCancha);
    }
}
