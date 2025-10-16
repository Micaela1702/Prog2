package JuegoDeGolosinas;

public class BuscadorPorFortaleza extends Buscador{
    private double fortaleza;


    public BuscadorPorFortaleza(double fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getFortaleza() > fortaleza;
    }
}
