package Kiko;

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
}
