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

    @Override
    public double calcularPrecio(){
        return calcular.calcularPrecio(this);
    }
}
