package SitioWebNoticias;

import SitioWebNoticias.Condiciones.Buscador;

import java.util.ArrayList;

public abstract class Contenido {

    public abstract double obtenerCantidadNoticias();
    public abstract ArrayList<Noticia> buscar(Buscador condicion);
}
