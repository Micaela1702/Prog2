package Coleccionables.Condiciones;

import Coleccionables.Figurita;

public class CondicionAND extends Buscador{
    private Buscador cond1, cond2;

    public CondicionAND(Buscador cond1, Buscador cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Figurita figurita) {
        return cond1.cumple(figurita) && cond2.cumple(figurita);
    }
}
