package Futbol5.Comparadores;

import Futbol5.Socio;

import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Socio> {
    @Override
    public int compare(Socio socio1, Socio socio2) {
        int resultado = socio1.getApellido().compareTo(socio2.getApellido());
        if(resultado == 0){
            return socio1.getNombre().compareTo(socio2.getNombre());
        }
        return resultado;
    }
}
