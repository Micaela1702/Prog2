package BusquedaDeDocumentos.Condiciones;

import BusquedaDeDocumentos.Documento;

public class CondicionPorContenido extends Buscador {

    private String palabraDada;
    private String fraseDada;

    public CondicionPorContenido(String palabraDada, String fraseDada) {
        this.palabraDada = palabraDada;
        this.fraseDada = fraseDada;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getContenidoTextual().toLowerCase().contains(palabraDada) || documento.getContenidoTextual().toLowerCase().contains(fraseDada);
    }
}
