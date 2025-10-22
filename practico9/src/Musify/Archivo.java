package Musify;

public abstract class Archivo {
    private String titulo;

    public abstract double getDuracion();

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
