package Coleccionables;

import Coleccionables.Calculadores.CalculadorFigurita;

public class FiguritaLimitada extends Figurita{
    private int cantidadDisponibles;
    private CalculadorFigurita calcular;

    public FiguritaLimitada(String nombre, String album, int numero, double precio, int cantidadDisponibles, CalculadorFigurita calcular) {
        super(nombre, album, numero, precio);
        this.cantidadDisponibles = cantidadDisponibles;
        this.calcular = calcular;
    }

    public int getCantidadDisponibles() {
        return cantidadDisponibles;
    }

    public void setCantidadDisponibles(int cantidadDisponibles) {
        this.cantidadDisponibles = cantidadDisponibles;
    }

    public double getPrecioBase(){
        return super.calcularPrecio();
    }

    @Override
    public double calcularPrecio(){
        double precioFiguritaLimitada = calcular.calcularPrecio(this);
        if(precioFiguritaLimitada < getPrecioBase()){
            return getPrecioBase();
        }
        else {
            return precioFiguritaLimitada;
        }
    }
}
