package Agroquimicos;

import java.util.ArrayList;

public class Cultivo {

    private String nombre;
    private ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedades = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
