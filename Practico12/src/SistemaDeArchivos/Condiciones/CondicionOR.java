package SistemaDeArchivos.Condiciones;

import SistemaDeArchivos.ElementoSA;

public class CondicionOR extends Buscador {
    Buscador cond1, cond2;

    public CondicionOR(Buscador cond1, Buscador cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(ElementoSA elementoSA) {
        return cond1.cumple(elementoSA) || cond2.cumple(elementoSA);
    }
}
