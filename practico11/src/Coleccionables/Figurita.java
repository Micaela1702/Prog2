package Coleccionables;

import Coleccionables.Condiciones.Buscador;

import java.util.ArrayList;

public class Figurita extends Coleccionable {
    private String nombre;
    private String album;
    private int numero;
    private double precio;

    public Figurita(String nombre, String album, int numero, double precio) {
        this.nombre = nombre;
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }

    public String getAlbum() {
        return album;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public Coleccionable copiar(Buscador condicion) {
        Figurita copia = new Figurita(getNombre(), getAlbum(), getNumero(), calcularPrecio());
        if(condicion.cumple(this)){
            return copia;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<Figurita> buscar(Buscador condicion) {
        ArrayList<Figurita> resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    // implemento el equals
}
