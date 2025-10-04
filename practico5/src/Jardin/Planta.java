package Jardin;

import java.time.LocalDate;
import java.util.ArrayList;

public class Planta {

    private String nombreCientifico;
    private String nombre;
    private String pais;
    private LocalDate fechaCompra;
    private static int contadorId = 1;
    private int id_planta;


    public Planta(String nombreCien, String nom, String pais, LocalDate compra, int id_planta) {
        nombreCientifico = nombreCien;
        nombre = nom;
        this.pais = pais;
        fechaCompra = compra;
        this.id_planta = contadorId++; // asigna e incrementa automaticamente, ni bien se crea el objeto.

    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getId_planta() {
        return id_planta;
    }

    @Override
    public String toString() {
        return "Planta " + getNombre() +  // consultar si es mejor hacerlo así, que llamar al atributo propio de la clase.
                " id=" + getId_planta() +
                ", nombre cientifico='" + getNombreCientifico() + '\'' +
                ", nombre:'" + getNombre() + '\'' +
                ", pais:'" + getPais() + '\'' +
                ", fechaCompra:" + getFechaCompra();
    }
}
