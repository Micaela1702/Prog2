package SistemaDeArchivos.Comparadores;

import SistemaDeArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorFechaYNombre implements Comparator<ElementoSA> {

    @Override
    public int compare(ElementoSA elemento1, ElementoSA elemento2) {
        int comparacionFecha = elemento1.getFechaCreacion().compareTo(elemento2.getFechaCreacion());
        if(comparacionFecha != 0){  // chequea que en la fecha haya algo y no sea igual a 0
            return comparacionFecha;
        }
        return elemento1.getNombre().compareTo(elemento2.getNombre()); // compara por fecha y luego por nombre
    }
}
