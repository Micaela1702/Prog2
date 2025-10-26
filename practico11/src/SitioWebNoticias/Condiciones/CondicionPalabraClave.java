package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionPalabraClave extends Buscador{
    private String palabraClave;

    public CondicionPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.tienePalabra(palabraClave);
    }
}
