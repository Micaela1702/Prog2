package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionNOT extends Buscador {
    Buscador condicion;

    public CondicionNOT (Buscador condicion) {
        this.condicion = condicion;

    }

    @Override
    public boolean cumple(Noticia noticia) {
        return !condicion.cumple(noticia);
    }
}

