package Futbol5;

import java.time.LocalDate;

public class AlquilerCancha {
    private int id_cancha;
    private LocalDate fechaAlquiler;
    private double precioAlquiler;

    public AlquilerCancha(int id_cancha, LocalDate fechaAlquiler, double precioAlquiler) {
        this.id_cancha = id_cancha;
        this.fechaAlquiler = fechaAlquiler;
        this.precioAlquiler = precioAlquiler;
    }

    public boolean estaAlquilada(int id_cancha){
        return this.id_cancha == id_cancha;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public void setId_cancha(int id_cancha) {
        this.id_cancha = id_cancha;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
}
