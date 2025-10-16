package JuegoDeGolosinas;

public class BuscadorOR extends Buscador{
    private Buscador cond1, cond2;

    public BuscadorOR(Buscador cond1, Buscador cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return cond1.cumple(ficha) || cond2.cumple(ficha);
    }
}
