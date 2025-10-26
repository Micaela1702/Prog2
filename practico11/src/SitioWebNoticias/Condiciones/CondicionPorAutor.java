package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionPorAutor extends Buscador{
    private String autor;

    public CondicionPorAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equals(autor);
    }
}
