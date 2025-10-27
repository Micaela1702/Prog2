package Coleccionables;

import Coleccionables.Condiciones.Buscador;

import java.util.ArrayList;

public class ColeccionExclusiva extends ColeccionTematica{
    ArrayList<Coleccionable> coleccionables;

    public ColeccionExclusiva(String nombre, double precio, double descuento) {
        super(nombre, precio, descuento);
    }

    @Override
    public Coleccionable copiar(Buscador condicion) {
        ColeccionExclusiva copia = new ColeccionExclusiva(getNombre(), calcularPrecio(), getDescuento());
        return null;
    }
}
