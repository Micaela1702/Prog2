package SistemaDeAlquileres;

import java.time.LocalDate;

public class Pelicula extends Item {
    private String informacionFilmografica;
    private int cantidadCopias;

    public Pelicula(String nombre, LocalDate fechaLimite, Cliente alquiladoPor) {
        super(nombre, fechaLimite, alquiladoPor);
    }

    public String getInformacionFilmografica() {
        return informacionFilmografica;
    }

    public void setInformacionFilmografica(String informacionFilmografica) {
        this.informacionFilmografica = informacionFilmografica;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    @Override
    public boolean sePuedeAlquilar() {
        return cantidadCopias > 0;
    }
}
