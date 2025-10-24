package SitioWebNoticias;

import SitioWebNoticias.Condiciones.Buscador;

import java.util.ArrayList;

public class Noticia extends Contenido{
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

    public boolean tienePalabra(String palabra){
        return palabras.contains(palabra);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    @Override
    public double obtenerCantidadNoticias() {
        return 1;
    }

    @Override
    public ArrayList<Noticia> buscar(Buscador condicion) {
        ArrayList<Noticia> resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(this);
        }
    return resultado;
    }
}
