package SistemaDeAlquileres;

import java.time.LocalDate;

public abstract class Item {
    private String nombre;
    private LocalDate fechaLimite;
    private Cliente alquiladoPor;

    public Item(String nombre, LocalDate fechaLimite, Cliente alquiladoPor) {
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
        this.alquiladoPor = alquiladoPor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean estaVencido(){
        return fechaLimite != null && fechaLimite.isBefore(LocalDate.now()); // chequea que en la fecha haya algo, y que adémas esté antes
                                                                             // del día de hoy.
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Cliente getAlquiladoPor() {
        return alquiladoPor;
    }

    public void setAlquiladoPor(Cliente alquiladoPor) {
        this.alquiladoPor = alquiladoPor;
    }

    public abstract boolean sePuedeAlquilar();

}
