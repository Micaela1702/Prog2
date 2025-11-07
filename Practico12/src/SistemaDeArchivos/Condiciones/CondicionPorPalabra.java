package SistemaDeArchivos.Condiciones;

import SistemaDeArchivos.ElementoSA;

public class CondicionPorPalabra extends Buscador{
    private String palabra;

    public CondicionPorPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(ElementoSA elementoSA) {
        return elementoSA.getNombre().contains(palabra);
    }
}
