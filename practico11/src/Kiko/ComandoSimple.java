package Kiko;

import Kiko.Condiciones.Buscador;

import java.util.ArrayList;

public class ComandoSimple extends Accion {

    private String instruccion;
    private double gastoDeBateria;
    private double tiempoEjecucion;

    public ComandoSimple(String instruccion, double gastoDeBateria, double tiempoEjecucion) {
        this.instruccion = instruccion;
        this.gastoDeBateria = gastoDeBateria;
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    @Override
    public double calcularTiempoEjecucion() {
        return tiempoEjecucion;
    }

    @Override
    public double calcularGastoBateria() {
        return gastoDeBateria;
    }

    public double getCantidadTarjetas(){
        return 1;
    }

    @Override
    public ArrayList<ComandoSimple> buscar(Buscador condicion) {
        ArrayList<ComandoSimple> resultado = new ArrayList<>();
        if (condicion.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public Accion copiar(Buscador condicion) {
        ComandoSimple copia = new ComandoSimple(getInstruccion(), calcularGastoBateria(), calcularTiempoEjecucion());
        if(condicion.cumple(this)){
            return copia;
        } else {
            return null;
        }
    }
}
