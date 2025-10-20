package Personajes;

public class FrutaPesoPorDiez extends Fruta{

    private final static int constante = 10;


    public FrutaPesoPorDiez(String nombre) {
        super(nombre);

    }


    @Override
    public double calculoFuerza(double peso) {
        return peso * constante;
    }
}
