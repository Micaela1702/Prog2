package Kiko.Condiciones;

import Kiko.ComandoSimple;

public class CondicionGastoBateria extends Buscador{
    private double gastoBateria;

    public CondicionGastoBateria(double gastoBateria) {
        this.gastoBateria = gastoBateria;
    }

    @Override
    public boolean cumple(ComandoSimple comandoSimple) {
        return comandoSimple.calcularGastoBateria() < gastoBateria;
    }
}
