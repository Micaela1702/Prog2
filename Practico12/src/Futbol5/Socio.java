package Futbol5;

import java.util.ArrayList;


public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estaPaga;
    private ArrayList<AlquilerCancha> alquilerCanchas;


    public Socio(String nombre, String apellido, int edad, boolean estaPaga){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estaPaga = estaPaga;
        this.alquilerCanchas = new ArrayList<>();
    }

    public void agregarCancha(AlquilerCancha cancha){
        alquilerCanchas.add(cancha);
    }

    public boolean canchaAlquilada(int idCanchaBuscada){
        for(AlquilerCancha alquiler: alquilerCanchas){
            if(alquiler.getId_cancha() == idCanchaBuscada){
                return true;
            }
        }
        return false;
    }


    public int cantidadDeAlquileresPorCancha(int idCanchaBuscada){
        int contador=0;
        for(AlquilerCancha alquiler: alquilerCanchas){
            if(alquiler.getId_cancha() == idCanchaBuscada){
                contador++;
            }
        }
        return contador;
    }

    public boolean pagoAlquiler(int monto){
       for (AlquilerCancha alquiler: alquilerCanchas){
           if(alquiler.getPrecioAlquiler() > monto){
               return true;
           }
       }
       return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstaPaga() {
        return estaPaga;
    }

    public void setEstaPaga(boolean estaPaga) {
        this.estaPaga = estaPaga;
    }

}
