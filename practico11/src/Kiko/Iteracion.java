package Kiko;

import Kiko.Condiciones.Buscador;

import java.util.ArrayList;

public class Iteracion extends Accion {
    private Accion accion;
    private int cantidadIteraciones;

    public Iteracion(double tiempoEjecucion, double gastoBateria, int cantidadIteraciones) {
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
        return accion.calcularTiempoEjecucion() * cantidadIteraciones;
    }

    @Override
    public double calcularGastoBateria() {
        return accion.calcularGastoBateria() * cantidadIteraciones;
    }

    @Override
    public ArrayList<ComandoSimple> buscar(Buscador condicion) {
        ArrayList<ComandoSimple> resultado = new ArrayList<>();
    }

    @Override
    public Accion copiar(Buscador condicion) {
        Iteracion copia = new Iteracion(calcularTiempoEjecucion(), calcularGastoBateria(), getCantidadIteraciones());
        if(condicion.cumple(this)){
            copia.addElemento(this);
        }
    }
}
