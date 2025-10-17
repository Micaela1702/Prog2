package Streaming;

import java.util.ArrayList;

public class PlataformaStreamingV {
    private String nombre;
    private ArrayList<Pelicula> peliculas;


    public PlataformaStreamingV(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();

    }

    public void agregarPelicula(Pelicula p){
        peliculas.add(p);
    }

    public ArrayList<Pelicula> peliculas(CriterioRentabilidad criterioRentabilidad) {
        ArrayList<Pelicula> Resultado = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if(criterioRentabilidad.esRentable(p)){
                Resultado.add(p);
            }
        }
        return Resultado;
    }
}
