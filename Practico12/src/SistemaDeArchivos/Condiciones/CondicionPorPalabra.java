package SistemaDeArchivos.Condiciones;

import SistemaDeArchivos.ElementoSA;

public class CondicionPorPalabra extends Buscador{

    @Override
    public boolean cumple(ElementoSA elementoSA) {
        String palabra = "parcial";
        return elementoSA.getNombre().contains(palabra);
    }
}
