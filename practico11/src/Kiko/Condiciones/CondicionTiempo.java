package Kiko.Condiciones;

import Kiko.ComandoSimple;

public class CondicionTiempo extends Buscador{
    private double tiempo;

    public CondicionTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(ComandoSimple comandoSimple) {
        return comandoSimple.calcularTiempoEjecucion() < tiempo;
    }
}
