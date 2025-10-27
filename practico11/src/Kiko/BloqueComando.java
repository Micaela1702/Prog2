package Kiko;

import Kiko.Condiciones.Buscador;

import java.util.ArrayList;

public class BloqueComando extends Accion {
    private double tiempoEjecucion;
    private double gastoBateria;
    private static int extraFijo = 5;
    protected ArrayList<Accion> bloquesComandos;

    public BloqueComando(double tiempoEjecucion, double gastoBateria) {
        this.tiempoEjecucion = tiempoEjecucion;
        this.gastoBateria = gastoBateria;
        this.bloquesComandos = new ArrayList<>();
    }

    public static void setExtraFijo(int extraFijo) { // porque puede cambiar a futuro.
        BloqueComando.extraFijo = extraFijo;
    }

    @Override
    public double calcularTiempoEjecucion() {
        double totalTiempo=0;
        for(Accion accion: bloquesComandos){
            totalTiempo+=accion.calcularTiempoEjecucion();
        }
        return totalTiempo;
    }

    @Override
    public double calcularGastoBateria() {
        double gastoTotal=0;
        for(Accion accion: bloquesComandos){
            gastoTotal+=accion.calcularGastoBateria();
        }
        return gastoTotal + extraFijo * calcularTiempoEjecucion();
    }

    @Override
    public double getCantidadTarjetas() {
        double totalTarjetas=0;
        for (Accion accion: bloquesComandos){
            totalTarjetas+=accion.getCantidadTarjetas();
        }
        return totalTarjetas;
    }

    public void addElemento(Accion elemento){
        if(!bloquesComandos.isEmpty()){
            bloquesComandos.add(elemento);
        }
    }
    public boolean tieneElementos(){
        return !bloquesComandos.isEmpty();
    }

    @Override
    public ArrayList<ComandoSimple> buscar(Buscador condicion) {
        ArrayList<ComandoSimple> resultado = new ArrayList<>();
        for(Accion accion: bloquesComandos){
            resultado.addAll(accion.buscar(condicion));
        }
        return resultado;
    }

    @Override
    public Accion copiar(Buscador condicion) {
        BloqueComando copia = new BloqueComando(calcularTiempoEjecucion(), calcularGastoBateria());
        for(Accion accion: bloquesComandos){
            Accion accion1 = accion.copiar(condicion);
            if(accion1 != null){
                copia.addElemento(accion1);
            }
        }
        if(tieneElementos()){
            return copia;
        } else {
            return null;
        }
    }
}
