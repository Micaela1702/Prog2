package BusquedaDeDocumentos;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenidoTextual;
    private ArrayList<String> palabrasClave;
    private int cantidadPalabras;

    public Documento(String titulo, String contenidoTextual, int cantidadPalabras) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.contenidoTextual = contenidoTextual;
        this.palabrasClave = new ArrayList<>();
        this.cantidadPalabras = cantidadPalabras;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    public void agregarPalabrasClaves(String palabraClave){
        palabrasClave.add(palabraClave);
    }

    public void agregarAutor(String autor){
        autores.add(autor);
    }

    public ArrayList<String> getPalabrasClave(){
        return new ArrayList<>(palabrasClave);
    }

    public ArrayList<String> getAutores(){
        return new ArrayList<>(autores);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }

}
