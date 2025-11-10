package Electronica;

public class ProductoDigital extends Producto{
    private static double stockProdDigitales = 2.500000;


    public ProductoDigital(String nombre, double valor, int cantidadStock) {
        super(nombre, valor, cantidadStock);
    }

    @Override
    public double getCantidadProductosEnStock() {
        return stockProdDigitales;
    }
}
