package SitioWebNoticias;

import SitioWebNoticias.Condiciones.Buscador;

import java.util.ArrayList;

public class Categoria extends Contenido{
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

    public void addElemento(Contenido elemento){
        if(!secciones.contains(elemento)){
            secciones.add(elemento);
        }
    }

    public boolean tieneElementos() {
        return !secciones.isEmpty();
    }

    @Override
    public double obtenerCantidadNoticias() {
        double cantidadTotal = 0;
        for(Contenido seccion: secciones){
            cantidadTotal+=seccion.obtenerCantidadNoticias();
        }
        return cantidadTotal;
    }

    @Override
    public ArrayList<Noticia> buscar(Buscador condicion) {
        ArrayList<Noticia> resultado = new ArrayList<>();
        for(Contenido seccion: secciones){
            resultado.addAll(seccion.buscar(condicion));
        }
        return resultado;
    }

    @Override
    public Contenido copiar(Buscador condicion) {
        Categoria copia = new Categoria(getImagen(), getDescripcion());
        for(Contenido seccion: secciones) {
            Contenido copiaCategoria = seccion.copiar(condicion);
            if (copiaCategoria != null) {
                copia.addElemento(copiaCategoria);
            }
        }
        if(copia.tieneElementos()){
            return copia;
        } else {
            return null;
        }
    }
}
