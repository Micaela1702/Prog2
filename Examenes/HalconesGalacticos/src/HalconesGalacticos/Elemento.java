package HalconesGalacticos;

import HalconesGalacticos.Condiciones.Condicion;

import java.util.ArrayList;

public abstract class Elemento {
    public abstract double getTalle();
    public abstract ArrayList<String> getMetales();
    public abstract ArrayList<Traje> buscar(Condicion condicion);

}
