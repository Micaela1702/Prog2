package BusquedaDeDocumentos.Condiciones;

import BusquedaDeDocumentos.Documento;

public class CondicionPorTitulo extends Buscador {
    private String titulo;


    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento tituloDoc) {
        return tituloDoc.getTitulo().equals(titulo);
    }
}
