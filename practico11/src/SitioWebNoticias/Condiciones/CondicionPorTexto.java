package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionPorTexto extends Buscador{
    private int largoTexto;

    public CondicionPorTexto(int largoTexto) {
        this.largoTexto = largoTexto;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getLargoTexto() > largoTexto;
    }
}
