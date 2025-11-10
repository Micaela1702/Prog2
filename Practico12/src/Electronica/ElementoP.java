package Electronica;

import Electronica.Condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElementoP {

    public abstract String getNombre();
    public abstract double getValor();
    public abstract double getCantidadProductosEnStock();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ArrayList<ElementoP> buscar(Condicion condicion);

}
