package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionAND extends Buscador{
    Buscador cond1, cond2;

    public CondicionAND(Buscador cond1, Buscador cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return cond1.cumple(noticia) && cond2.cumple(noticia);
    }
}
