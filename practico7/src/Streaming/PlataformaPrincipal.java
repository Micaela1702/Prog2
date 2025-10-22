package Streaming;

import Streaming.Condiciones.CriterioDuracionGenero;
import Streaming.Condiciones.CriterioRentabilidad;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlataformaPrincipal {

    public static void main(String[] args) {
        CriterioRentabilidad criterio = new CriterioDuracionGenero(120, "comedia");

        PlataformaStreamingV plataforma = new PlataformaStreamingV("CinePlus");

        plataforma.agregarPelicula(new Pelicula(
                "Aventura",
                "Una travesía épica por tierras desconocidas",
                "drama",
                "Juan Pérez",
                LocalDate.of(2018, 5, 10),
                110
        ));

        plataforma.agregarPelicula(new Pelicula(
                "Risa Total",
                "Comedia hilarante sobre la vida en la oficina",
                "comedia",
                "Laura Gómez",
                LocalDate.of(2016, 3, 20),
                130
        ));

        ArrayList<Pelicula> rentables = plataforma.peliculas(criterio);

        // Para mostrar resultados
        for (Pelicula p : rentables) {
            System.out.println(p.getTitulo());
        }
    }
}