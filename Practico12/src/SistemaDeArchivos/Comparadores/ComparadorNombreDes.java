package SistemaDeArchivos.Comparadores;

import SistemaDeArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorNombreDes implements Comparator<ElementoSA> {
    @Override
    public int compare(ElementoSA elemento1, ElementoSA ele2) {
        return reversed().compare(elemento1, ele2);
    }
}
