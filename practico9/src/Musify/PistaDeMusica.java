package Musify;

import Musify.Condiciones.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;

public class PistaDeMusica extends Archivo{
    private int ID_musica;
    private double duracion;
    private String artista;
    private String tituloAlbum;
    private LocalDate anio;
    private String genero;

    public PistaDeMusica(String titulo, int ID_musica, double duracion, String artista, String tituloAlbum, LocalDate anio, String genero) {
        super(titulo);
        this.ID_musica = ID_musica;
        this.duracion = duracion;
        this.artista = artista;
        this.tituloAlbum = tituloAlbum;
        this.anio = anio;
        this.genero = genero;
    }

    public int getID_musica() {
        return ID_musica;
    }

    public void setID_musica(int ID_musica) {
        this.ID_musica = ID_musica;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getDuracion() {
        return duracion;
    }

    @Override

    public ArrayList<PistaDeMusica> buscar(Buscador condicion) {
        ArrayList<PistaDeMusica> resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }
}
