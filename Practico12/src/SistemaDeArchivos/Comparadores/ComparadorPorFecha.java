package SistemaDeArchivos.Comparadores;

import SistemaDeArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorPorFecha implements Comparator<ElementoSA> {
    @Override
    public int compare(ElementoSA elemento, ElementoSA elemento2) {
        return elemento.getFechaCreacion().compareTo(elemento2.getFechaCreacion());
    }
}
