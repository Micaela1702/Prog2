package SitioWebNoticias;

import java.util.ArrayList;

public class Categoria extends Contenido {
    private ArrayList<Contenido> secciones;

    public Categoria(String descripcion, String imagen) {
        super(descripcion, imagen);
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
    public ArrayList<Noticia> buscar() {
        ArrayList<Noticia> resultado = new ArrayList<>();
        for(Contenido seccion: secciones){
            resultado.addAll(seccion.buscar());
        }
       return resultado;
    }
}
