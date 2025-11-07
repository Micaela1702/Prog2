package SistemaDeArchivos.Comparadores;

import SistemaDeArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorInverso implements Comparator<ElementoSA> {
    private Comparator<ElementoSA> comparador;

    public ComparadorInverso(Comparator<ElementoSA> comparador) {
        this.comparador = comparador;
    }

    @Override
    public int compare(ElementoSA elemento1, ElementoSA ele2) {
        return -comparador.compare(elemento1, ele2);
    }
}
