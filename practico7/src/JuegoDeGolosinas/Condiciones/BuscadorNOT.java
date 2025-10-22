package JuegoDeGolosinas.Condiciones;

import JuegoDeGolosinas.Ficha;

public class BuscadorNOT extends Buscador{
    private Buscador cond1;

    public BuscadorNOT(Buscador cond1) {
        this.cond1 = cond1;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return !cond1.cumple(ficha);
    }
}
