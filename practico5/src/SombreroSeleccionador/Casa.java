package SombreroSeleccionador;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private ArrayList<String> cualidadesRequeridas;
    protected ArrayList<Alumno> alumnos;
    private int capacidadMaxima;

    public Casa(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.cualidadesRequeridas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.capacidadMaxima = capacidadMaxima;
    }

    public void agregarCualidadad(String ss){
        cualidadesRequeridas.add(ss);
    }

    public boolean tieneCualidades(String ss){
        return cualidadesRequeridas.contains(ss);
    }

    public boolean estaLLena(){
        return !(capacidadMaxima < alumnos.size());
    }
    public boolean aceptarAlumno(Alumno aa){
        if(!this.estaLLena() && aa.getCasa() == null){
            for (String cualidadesRequerida : cualidadesRequeridas) {
                if (!aa.tieneCualidades(cualidadesRequerida)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void agregarAlumno(Alumno aa){
        if(this.aceptarAlumno(aa)){
            alumnos.add(aa);
            aa.setCasa(this);
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

}







