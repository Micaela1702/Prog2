package JuegoDeGolosinas;

public class FichaEspecial extends Ficha {


    public FichaEspecial(double fortaleza, double espacio, double poderDestruccion) {
        super(fortaleza, espacio, poderDestruccion);
    }

    @Override
    public double getPoderDestruccion(){
        return getFortaleza() / getEspacio();
    }
}
