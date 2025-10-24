package SitioWebNoticias;

import SitioWebNoticias.Condiciones.Buscador;

import java.util.ArrayList;

public class Categoria extends Contenido {
    private ArrayList<Contenido> secciones;
    private String descripcion;
    private String imagen;

    public Categoria(String descripcion, String imagen) {
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
    @Override
    public double obtenerCantidadNoticias() {
        double cantidadNoticias=0;
        for(Contenido seccion : secciones){
            cantidadNoticias += seccion.obtenerCantidadNoticias(); // de cada sección cuento el total de noticias que hay
        }
        return cantidadNoticias;
    }

    @Override
    public ArrayList<Noticia> buscar(Buscador condicion) {
        ArrayList<Noticia> resultado = new ArrayList<>();
        for(Contenido seccion: secciones){
            resultado.addAll(seccion.buscar(condicion));
        }
       return resultado;
    }
}
