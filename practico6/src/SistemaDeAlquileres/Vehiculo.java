package SistemaDeAlquileres;

import java.time.LocalDate;

public class Vehiculo extends Item {
    private String marca;
    private double km;
    private String patente;
    private String tipo;

    public Vehiculo(String nombre, LocalDate fechaLimite, Cliente alquiladoPor, String marca, String patente, String tipo) {
        super(nombre, fechaLimite, alquiladoPor);
        this.marca = marca;
        this.patente = patente;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public boolean sePuedeAlquilar() {
        return getAlquiladoPor() == null;
    }

}
