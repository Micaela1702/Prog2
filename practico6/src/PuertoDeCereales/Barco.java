package PuertoDeCereales;

public class Barco {

    private String nombre;
    private String patenteDeNavegacion;
    private double capacidad;
    private Camion camion;


    public Barco(String nombre, String patenteDeNavegacion, double capacidad) {
        this.nombre = nombre;
        this.patenteDeNavegacion = patenteDeNavegacion;
        this.capacidad = capacidad;
    }

    public boolean estaVacio(){
       return camion == null; //“El barco está vacío si no tiene ningún camión asignado”
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatenteDeNavegacion() {
        return patenteDeNavegacion;
    }

    public void setPatenteDeNavegacion(String patenteDeNavegacion) {
        this.patenteDeNavegacion = patenteDeNavegacion;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void asignoCarga(Camion camion) {
        this.camion = camion;
    }
}
