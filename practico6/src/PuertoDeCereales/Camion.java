package PuertoDeCereales;

import java.time.LocalDate;

public class Camion {
    private String nombre;
    private String patente;
    private LocalDate fechaCargamento;
    boolean tieneCarga = true;

    public Camion(String nombre, String patente, LocalDate fechaCargamento) {
        this.nombre = nombre;
        this.patente = patente;
        this.fechaCargamento = fechaCargamento;
    }

    public boolean estaVacio(){
        return !tieneCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public LocalDate getFechaCargamento() {
        return fechaCargamento;
    }

    public void setFechaCargamento(LocalDate fechaCargamento) {
        this.fechaCargamento = fechaCargamento;
    }

}
