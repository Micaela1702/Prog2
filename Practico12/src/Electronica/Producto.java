package Electronica;

import java.util.ArrayList;

public class Producto extends ElementoP{
    private String nombre;
    private double valor;
    private ArrayList<String> palabrasClaves;
    private int cantidadStock;
    private static int stockProdDigitales;

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double getCantidadProductos() {
        return 1;
    }

    @Override
    public int getPalabrasClave() {
        return palabrasClaves.size();
    }
    public void agregarPalabraClave(String palabra){
        palabrasClaves.add(palabra);
    }

    public boolean tienePalabraClave(String palabra){
        return palabrasClaves.contains(palabra);
    }
}
