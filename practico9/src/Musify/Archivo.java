package Musify;
import Musify.Condiciones.Buscador;
import java.util.ArrayList;

public abstract class Archivo {
    private String titulo;

    public abstract double getDuracion();
    public abstract ArrayList<PistaDeMusica>buscar(Buscador condicion);


    public Archivo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
