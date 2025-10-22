package BusquedaDeDocumentos.Condiciones;

import BusquedaDeDocumentos.Documento;

public class CondicionPorPalabra extends Buscador {

    private String palabra;

    public CondicionPorPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento tituloDoc) {
        return tituloDoc.getTitulo().contains(palabra);
    }
}
