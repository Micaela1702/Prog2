package Futbol5.Comparadores;

import Futbol5.Socio;

import java.util.Comparator;

public class ComparadorCuotasPagas implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
        int resultado = socio1.getApellido().compareTo(socio2.getApellido());
        if (socio1.isEstaPaga() && socio2.isEstaPaga()) {
            return 0;
        } else if (!socio1.isEstaPaga() && socio2.isEstaPaga()) {
            return 1;
        } else if (socio1.isEstaPaga() && !socio2.isEstaPaga()) {
            return -1;
        }
        return resultado;
    }
}
