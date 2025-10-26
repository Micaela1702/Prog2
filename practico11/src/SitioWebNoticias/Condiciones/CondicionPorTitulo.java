package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionPorTitulo extends Buscador{
    private String titulo;

    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().equalsIgnoreCase(titulo);
    }
}
