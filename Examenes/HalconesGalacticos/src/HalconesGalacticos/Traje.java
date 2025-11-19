package HalconesGalacticos;

import HalconesGalacticos.Condiciones.Condicion;

import java.util.ArrayList;

public class Traje extends Elemento{
    private String nombre;
    private int talle;
    private ArrayList<String> metalesUsados;
    private String planetaOrigen;

    public Traje(String nombre, int talle, String planetaOrigen) {
        this.nombre = nombre;
        this.talle = talle;
        this.planetaOrigen = planetaOrigen;
        this.metalesUsados = new ArrayList<>();
    }

    @Override
    public double getTalle() {
        return 0;
    }

    @Override
    public ArrayList<String> getMetales() {
       return new ArrayList<>(metalesUsados);
    }

    @Override
    public ArrayList<Traje> buscar(Condicion condicion) {
        return null;
    }
}
