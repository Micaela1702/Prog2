package Electronica;

import java.util.ArrayList;

public class Producto extends ElementoP{
    private String nombre;
    private double valor;
    private ArrayList<String> palabrasClaves;
    private int cantidadStock;
    private static int stockProdDigitales;

    public Producto(String nombre, double valor, int cantidadStock, int stockProdDigitales) {
        this.nombre = nombre;
        this.valor = valor;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCantidadProductosEnStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public static int getStockProdDigitales() {
        return stockProdDigitales;
    }

    public static void setStockProdDigitales(int stockProdDigitales) {
        Producto.stockProdDigitales = stockProdDigitales;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double getCantidadProductos() {
        return 1;
    }

    @Override
    public double getCantidadProductosEnStock() {
       return cantidadStock;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClaves);
    }
    public void agregarPalabraClave(String palabra){
        palabrasClaves.add(palabra);
    }

    public boolean tienePalabraClave(String palabra){
        return palabrasClaves.contains(palabra);
    }
}
