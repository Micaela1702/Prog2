package BusquedaDeDocumentos.Condiciones;

import BusquedaDeDocumentos.Documento;

public class CondicionNOTpalabraClave extends Buscador {
    private String palabraClave;

    public CondicionNOTpalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Documento documento) {
        return !documento.getPalabrasClave().isEmpty();
    }
}