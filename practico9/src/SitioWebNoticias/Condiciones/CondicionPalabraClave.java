package SitioWebNoticias.Condiciones;

import SitioWebNoticias.Noticia;

public class CondicionPalabraClave extends Buscador{
    private String palabraClave1, getPalabraClave2;

    public CondicionPalabraClave(String palabraClave1, String getPalabraClave2) {
        this.palabraClave1 = palabraClave1;
        this.getPalabraClave2 = getPalabraClave2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getPalabras().contains(palabraClave1) && noticia.getPalabras().contains(getPalabraClave2);
    }
}
