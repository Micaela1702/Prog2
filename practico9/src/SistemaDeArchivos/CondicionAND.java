package SistemaDeArchivos;

public class CondicionAND extends Buscador{
    Buscador cond1, cond2;

    public CondicionAND(Buscador cond1, Buscador cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(ElementoSA elementoSA) {
        return cond1.cumple(elementoSA) && cond2.cumple(elementoSA);
    }
}
