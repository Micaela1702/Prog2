package Streaming;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private String genero;
    private String director;
    ArrayList<String> actores;
    LocalDate anioEstreno;
    private double duracion;

    public Pelicula(String titulo, String sinopsis, String genero, String director, LocalDate anioEstreno, double duracion) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.director = director;
        this.actores = new ArrayList<>();
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
    }

    public ArrayList<String> getActores(){
        return new ArrayList<>(actores);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(LocalDate anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
