package SombreroSeleccionador;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<String> familiares;
    private Casa casa;

    public Alumno(String nombre, Casa casa) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
        this.casa = casa;
    }
    public void agregarCualidad(String cualidad) {
        cualidades.add(cualidad);
    }

    public void agregarFamiliar(String familiar) {
        familiares.add(familiar);
    }

    public boolean esFamiliar(Alumno aa){
        return familiares.contains(aa);
    }

    public boolean tieneCualidades(String ss){
        return cualidades.contains(ss);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
