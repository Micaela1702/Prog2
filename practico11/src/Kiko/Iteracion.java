package Kiko;

import Kiko.Condiciones.Buscador;

import java.util.ArrayList;

public class Iteracion extends Accion {
    private Accion accion;
    private int cantidadIteraciones;

    public Iteracion(double tiempoEjecucion, double gastoBateria, int cantidadIteraciones) {
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
        return accion.calcularTiempoEjecucion() * cantidadIteraciones;
    }

    @Override
    public double calcularGastoBateria() {
        return accion.calcularGastoBateria() * cantidadIteraciones;
    }

    @Override
    public double getCantidadTarjetas() {
        return 0;
    }

    @Override
    public ArrayList<ComandoSimple> buscar(Buscador condicion) {
        return accion.buscar(condicion); // busco la acción que contiene
    }

    @Override
    public Accion copiar(Buscador condicion) {
        return accion.copiar(condicion); // que tenga elementos lo controlo en la clase bloque comando o simple.
    }
}
