package Personajes;

public class FrutaFuerzaFija extends Fruta{

    private double fuerzaFija = 120;

    public FrutaFuerzaFija(String nombre) {
        super(nombre);
    }



    @Override
    public double calculoFuerza(double peso) {
        return fuerzaFija;
    }
}
