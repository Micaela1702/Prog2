package Futbol5.Comparadores;

import Futbol5.Socio;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Socio> {
    @Override
    public int compare(Socio socio1, Socio socio2) {
        return Integer.compare(socio1.getEdad(), socio2.getEdad());
    }
}
