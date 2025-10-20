package Personajes;

public class FrutaPesoPorSiete extends Fruta{

    private final static int constante = 7;
    private final static int valorFijo = 110;

    public FrutaPesoPorSiete(String nombre) {
        super(nombre);
    }

    @Override
    public double calculoFuerza(double peso) {
        return valorFijo + peso * constante;
    }
}
