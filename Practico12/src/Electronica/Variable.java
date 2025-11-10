package Electronica;


public class Variable extends Producto{

    public Variable(String nombre, double valor, int cantidadStock, int stockProdDigitales) {
        super(nombre, valor, cantidadStock, stockProdDigitales);
    }

    @Override
    public double getCantidadProductosEnStock(){
        return getPalabrasClave().size();
    }
}
