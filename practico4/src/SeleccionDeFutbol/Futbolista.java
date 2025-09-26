package SeleccionDeFutbol;

import java.time.LocalDate;
import java.util.Objects;

public class Futbolista extends Integrante {
    private String pos;
    private int cantidadGoles;
    private boolean esZurdo;



    public Futbolista(String nombre, String apellido, String pasaporte, LocalDate fechaNacimiento, boolean esZurdo,
                      String posicion, int goles, String estado) {
        super(nombre, apellido, pasaporte, fechaNacimiento, estado);
        pos = posicion;
        this.esZurdo = esZurdo;
        cantidadGoles = goles;
    }


    public boolean isEsZurdo() {
        return esZurdo;
    }

    public void setEsZurdo(boolean esZurdo) {
        this.esZurdo = esZurdo;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

}
