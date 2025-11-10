package Electronica.Comparadores;

import Electronica.Producto;

import java.util.Comparator;

public class ComparadorCosto implements Comparator<Producto> { // este creo que se puede borrar, debido a que está el compuesto

    @Override
    public int compare(Producto producto1, Producto producto2) {
        int resultado = Double.compare(producto1.getValor(), producto2.getValor());
        if (resultado == 0) {
            return producto1.getNombre().compareTo(producto2.getNombre());
        } else {
            return resultado;
        }
    }
}
