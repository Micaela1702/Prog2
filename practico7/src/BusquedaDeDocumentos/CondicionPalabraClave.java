package BusquedaDeDocumentos;

public class CondicionPalabraClave extends Buscador {
    private String palabraClave;

    public CondicionPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getPalabrasClave().contains(palabraClave);
    }
}
