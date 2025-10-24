package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionPalabraClave extends Buscador{
    private String palabraClave1;

    public CondicionPalabraClave(String palabraClave1) {
        this.palabraClave1 = palabraClave1;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.tienePalabra(palabraClave1);
    }
}
