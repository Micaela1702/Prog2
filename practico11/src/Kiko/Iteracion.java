package Kiko;

public class Iteracion extends Accion{
    private double tiempoEjecucion;
    private double gastoBateria;
    private int cantidadIteraciones;

    public Iteracion(double tiempoEjecucion, double gastoBateria, int cantidadIteraciones) {
        this.tiempoEjecucion = tiempoEjecucion;
        this.gastoBateria = gastoBateria;
        this.cantidadIteraciones = cantidadIteraciones;
    }

    public Iteracion(int cantidadIteraciones) {
        this.cantidadIteraciones = cantidadIteraciones;
    }

    public int getCantidadIteraciones() {
        return cantidadIteraciones;
    }

    public void setCantidadIteraciones(int cantidadIteraciones) {
        this.cantidadIteraciones = cantidadIteraciones;
    }


    @Override
    public double calcularTiempoEjecucion() {
        return tiempoEjecucion * cantidadIteraciones;
    }

    @Override
    public double calcularGastoBateria() {
        return gastoBateria * cantidadIteraciones;
    }
}
