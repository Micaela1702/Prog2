package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionPorAutor extends Buscador {
    private String Autor;

    public CondicionPorAutor(String autor) {
        Autor = autor;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equalsIgnoreCase(Autor);
    }
}
