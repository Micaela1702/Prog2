package BusquedaDeDocumentos.Condiciones;

import BusquedaDeDocumentos.Documento;

public class CondicionPorAutor extends Buscador {
    private String autor;

    public CondicionPorAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getAutores().contains(autor);
    }
}
