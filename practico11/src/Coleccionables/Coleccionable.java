package Coleccionables;

import Coleccionables.Condiciones.Buscador;

import java.util.ArrayList;

public abstract class Coleccionable {
    public abstract double calcularPrecio();
    public abstract Coleccionable copiar(Buscador condicion);
    public abstract ArrayList<Figurita>buscar(Buscador condicion);
}
