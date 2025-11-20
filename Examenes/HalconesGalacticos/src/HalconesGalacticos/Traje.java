package HalconesGalacticos;

import HalconesGalacticos.Condiciones.Condicion;

import java.util.ArrayList;

public class Traje extends Elemento{
    private String nombre;
    private int talle;
    private ArrayList<String> metalesUsados;
    private String planetaOrigen;
    private Condicion condicion;


    public Traje(String nombre, int talle, String planetaOrigen, Condicion condicion) {
        this.nombre = nombre;
        this.talle = talle;
        this.planetaOrigen = planetaOrigen;
        this.metalesUsados = new ArrayList<>();
        this.condicion = condicion;
    }

    @Override
    public double getTalle() {
        return talle;
    }

    @Override
    public ArrayList<String> getMetales() {
       return new ArrayList<>(metalesUsados);
    }
    public boolean soyApto (MiembroEquipo miembro){
        return condicion.cumple(miembro);
        }

    public ArrayList<Traje> listaTrajes(MiembroEquipo miembro){
        ArrayList<Traje> resultado = new ArrayList<>();
        if(soyApto(miembro)){
            resultado.add(this);
        }
        return resultado;
    }
}
