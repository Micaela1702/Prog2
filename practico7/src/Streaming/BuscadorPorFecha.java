package Streaming;

import java.time.LocalDate;

public class BuscadorPorFecha extends Buscador{
    private LocalDate fecha;
    private double duracion;

    public BuscadorPorFecha(LocalDate fecha, double duracion) {
        this.fecha = fecha;
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return (pelicula.getAnioEstreno().isBefore(fecha) && pelicula.getDuracion() < duracion);
    }
}
