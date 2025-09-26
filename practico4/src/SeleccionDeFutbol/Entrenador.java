package SeleccionDeFutbol;

import java.time.LocalDate;

public class Entrenador extends Integrante{


    private int id_federacion;

    public Entrenador(String nombre, String apellido, String pasaporte, LocalDate fechaNacimiento, int id_federacion, String estado) {
        super(nombre, apellido, pasaporte, fechaNacimiento, estado);
        this.id_federacion = id_federacion;
    }

    public int getId_federacion() {
        return id_federacion;
    }

    public void setId_federacion(int id_federacion) {
        this.id_federacion = id_federacion;
    }
}
