public class BuscadorNOT extends Buscador {
    private Buscador b1;


    public BuscadorNOT(Buscador b1) {
        this.b1 = b1;
    }

    @Override
    public boolean cumple(Planta planta) {
        return !b1.cumple(planta);
    }
}
