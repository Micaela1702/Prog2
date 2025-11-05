package Parcial.Condicion;

import Parcial.Vendedor;

public class CondicionOR extends Condicion{
    private Condicion cond1, cond2;

    public CondicionOR(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Vendedor vendedor) {
        return cond1.cumple(vendedor) || cond2.cumple(vendedor);
    }
}
