package Electronica.Comparadores;

import Electronica.Producto;

import java.util.Comparator;

public class ComparadorCosto implements Comparator<Producto> {
    @Override
    public int compare(Producto producto1, Producto producto2) {
        return Double.compare(producto1.getValor(), producto2.getValor());
    }
}
