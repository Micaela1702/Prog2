package Aseguradora.Condiciones;

import Aseguradora.SeguroSimple;

public class CondicionPorPalabra extends Buscador{
    private String palabra;

    public CondicionPorPalabra(String palabra) {
        this.palabra = palabra;
    }


    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getDescripcion().contains(palabra);
    }
}
