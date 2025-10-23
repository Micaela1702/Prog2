package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionTituloContiene extends Buscador {
    private String titulo;


    public CondicionTituloContiene(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().equalsIgnoreCase(titulo);
    }
}
