package SitioWebNoticias;

import java.util.ArrayList;

public class Noticia {
    private String titulo;
    private ArrayList<String> palabras;
    private String introduccion;
    private String texto;
    private String autor;
    private String accesoDirecto;
    private Categoria seccion;

    public Noticia(String titulo, String introduccion, String texto, String autor, String accesoDirecto, Categoria seccion) {
        this.titulo = titulo;
        this.palabras = new ArrayList<>();
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.accesoDirecto = accesoDirecto;
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAccesoDirecto() {
        return accesoDirecto;
    }

    public void setAccesoDirecto(String accesoDirecto) {
        this.accesoDirecto = accesoDirecto;
    }

    public int getLargoTexto(){
       return texto.length();
    }

}
