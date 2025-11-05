package Parcial.Condicion;

import Parcial.Vendedor;

public class CondicionGanancias extends Condicion{
    private double ganancias;

    public CondicionGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    @Override
    public boolean cumple(Vendedor vendedor) {
        return vendedor.calculoGanancia() < ganancias;
    }
}
