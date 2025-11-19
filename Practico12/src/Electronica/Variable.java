package Electronica;


public class Variable extends Producto{

    public Variable(String nombre, double valor, int cantidadStock) {
        super(nombre, valor, cantidadStock);
    }

    @Override
    public double getCantidadProductosEnStock(){
        return getPalabrasClave().size();
    }
}
