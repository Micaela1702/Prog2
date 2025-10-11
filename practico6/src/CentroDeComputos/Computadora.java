package CentroDeComputos;

public class Computadora {
    private String nombre;
    private double velocidad;
    private Proceso procesoEnEjecucion;

    public Computadora(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;

    }

    public void asignoProceso(Proceso proceso){
        this.procesoEnEjecucion = proceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}