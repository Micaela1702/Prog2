package SistemaDeArchivos;

import java.time.LocalDate;

public class Archivo extends ElementoSA { // clase simple

    private LocalDate fechaUltimaModificacion;
    private double tamanio;

    public Archivo(String nombre, LocalDate fechaCreacion, LocalDate fechaUltimaModificacion, double tamanio) {
        super(nombre, fechaCreacion);
        this.fechaUltimaModificacion = fechaUltimaModificacion;
        this.tamanio = tamanio;
    }

    public LocalDate getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(LocalDate fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    @Override
    public double calcularTamanio() {
        return tamanio;
    }
}
