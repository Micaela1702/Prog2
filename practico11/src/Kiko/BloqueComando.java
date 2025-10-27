package Kiko;

import java.util.ArrayList;

public class BloqueComando extends Accion {
    private double tiempoEjecucion;
    private double gastoBateria;
    private static int extraFijo = 5;
    ArrayList<Accion> bloquesComandos;

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
}
