package Aseguradora.Condiciones;

import Aseguradora.SeguroSimple;

public class CondicionMonto extends Buscador{
    private double monto;

    public CondicionMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(SeguroSimple seguroSimple) {
        return seguroSimple.getMontoAsegurado() > monto;
    }
}
