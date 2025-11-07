package SistemaDeArchivos.Comparadores;

import SistemaDeArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorPorTamanio implements Comparator<ElementoSA> {

    @Override
    public int compare(ElementoSA ele1, ElementoSA ele2) {
        return Double.compare(ele1.calcularTamanio(), ele2.calcularTamanio());
    }
}
