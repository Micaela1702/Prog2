package Parcial;

import java.util.ArrayList;

import Parcial.Condicion.Condicion;

public abstract class Persona {

    public abstract int calculoGanancia();
    public abstract ArrayList<Vendedor> buscar(Condicion Condicion);
    public abstract Persona copiar(Condicion condicion);
    public abstract int getEdad();
}
