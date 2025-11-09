package Wallpapers;

import Wallpapers.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;


public class Coleccion extends Plataforma {
    private String titulo;
    private int descarga;
    private ArrayList<Plataforma> colecciones;


    public Coleccion(String titulo) {
        this.titulo = titulo;
        this.colecciones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDescarga() {
        return descarga;
    }

    public void setDescarga(int descarga) {
        this.descarga = descarga;
    }

    public int getCantidadPalabrasClave(){
        int totalPalabras=0;
        for(Plataforma coleccion: colecciones){
            totalPalabras+=coleccion.getCantidadPalabrasClave();
        }
        return totalPalabras;
    }

    public int cantidadDescargasColeccion(){
        int totalColeccion=0;
        for(Plataforma coleccion: colecciones){
            totalColeccion+=this.cantidadDescargas();
        }
        return totalColeccion;
    }

    @Override
    public int cantidadWallpapers() {
        int cantidadTotal=0;
        for(Plataforma coleccion: colecciones){
            cantidadTotal+=coleccion.cantidadWallpapers();
        }
        return cantidadTotal;
    }

    @Override
    public int cantidadDescargas() {
        int totalDescargas=0;
        for(Plataforma coleccion: colecciones){
            totalDescargas+=coleccion.cantidadDescargas();
        }
        return totalDescargas + this.getDescarga();
    }

    @Override
    public ArrayList<Wallpaper> buscar(Condicion condicion) {
        ArrayList<Wallpaper> resultado = new ArrayList<>();
        for (Plataforma coleccion: colecciones){
            resultado.addAll(coleccion.buscar(condicion));
        }
        Collections.sort(resultado);
        return resultado;
    }

}
