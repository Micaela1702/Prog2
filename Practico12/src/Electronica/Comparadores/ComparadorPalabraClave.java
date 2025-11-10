package Electronica.Comparadores;

import Electronica.Producto;

import java.util.Comparator;

public class ComparadorPalabraClave implements Comparator<Producto> {
    @Override
    public int compare(Producto producto1, Producto producto2) {
        String palabra = producto1.getPalabrasClave().isEmpty() ? "": producto1.getPalabrasClave().get(0); // si no está vacía la lista, me traigo la primer palabra clave
        String palabra2 = producto2.getPalabrasClave().isEmpty() ? "": producto2.getPalabrasClave().get(0);
        return palabra.compareTo(palabra2); // compara ambas palabras
    }
}
