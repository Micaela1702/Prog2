package SitioWebNoticias;

import java.util.ArrayList;

public abstract class Contenido {
    private String descripcion;
    private String imagen;

    public Contenido(String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public abstract double obtenerCantidadNoticias();
    public abstract ArrayList<Noticia> buscar();
}
