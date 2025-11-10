package Electronica.Condiciones;

import Electronica.ElementoP;

public class CondicionEscaso extends Condicion{
    private int cantidadProductos;

    public CondicionEscaso(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public boolean cumple(ElementoP elemento) {
        return elemento.getCantidadProductosEnStock() < cantidadProductos;
    }
}
