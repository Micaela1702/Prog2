package Electronica;

import Electronica.Condiciones.Condicion;

import java.util.ArrayList;

public class Producto extends ElementoP{
    private String nombre;
    private double valor;
    private ArrayList<String> palabrasClaves;
    private int cantidadStock;

    public Producto(String nombre, double valor, int cantidadStock) {
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

    public void agregarPalabraClave(String palabra){
        palabrasClaves.add(palabra);
    }

    public boolean tienePalabraClave(String palabra){
        return palabrasClaves.contains(palabra);
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double getCantidadProductosEnStock() {
       return cantidadStock;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClaves);
    }

    @Override
    public ArrayList<ElementoP> buscar(Condicion condicion) {
        ArrayList<ElementoP> resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

}
