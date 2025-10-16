package JuegoDeGolosinas;

public class BuscadorPorDestruccion extends Buscador{

    private double poderDestruccion;

    public BuscadorPorDestruccion(double poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getPoderDestruccion() > poderDestruccion;
    }
}
