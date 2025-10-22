package BusquedaDeDocumentos.Condiciones;

import BusquedaDeDocumentos.Documento;

public class CondicionMinimo extends Buscador {
    private int minimoPalabras;

    public CondicionMinimo(int minimoPalabras) {
        this.minimoPalabras = minimoPalabras;
    }
    // Este código divide el contenido en palabras usando espacios
    // como separador (\\s+ cubre espacios, tabs, saltos de línea) y verifica si hay al menos 20.

    @Override
    public boolean cumple(Documento documento) {
        String[] palabras = documento.getContenidoTextual().trim().split("\\s+");
        return palabras.length >= minimoPalabras;
    }
}
