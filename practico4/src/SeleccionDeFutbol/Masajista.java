package SeleccionDeFutbol;

import java.time.LocalDate;

public class Masajista extends Integrante {
    private String titulo;
    private int aniosExperiencia;

    public Masajista(String nombre, String apellido, String pasaporte, LocalDate fechaNacimiento,
                     String titulo, int aniosExperiencia, String estado) {
        super(nombre, apellido, pasaporte, fechaNacimiento, estado);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosDeExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosDeExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
