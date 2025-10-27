package Coleccionables;

import Coleccionables.Condiciones.Buscador;

import java.util.ArrayList;

public class ColeccionTematica extends Coleccionable {
    private String nombre;
    private double precio;
    private double descuento;
    private ArrayList<Coleccionable> figuritas;

    public ColeccionTematica(String nombre, double precio, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public void addElemento(Coleccionable cl){
        figuritas.add(cl);
    }
    public boolean tieneElementos(){
        return !figuritas.isEmpty();
    }

    @Override
    public double calcularPrecio() {
        double precioTotal=0;
        for(Coleccionable figurita: figuritas){
            precioTotal += figurita.calcularPrecio();
        }
        return precioTotal;
    }

    @Override
    public Coleccionable copiar(Buscador condicion) {
       ColeccionTematica copia = new ColeccionTematica(getNombre(), getDescuento(), calcularPrecio());
       for(Coleccionable coleccionable: figuritas){
           Coleccionable cl = coleccionable.copiar(condicion);
           if(cl != null){
               copia.addElemento(cl);
           }
       }
       if(tieneElementos()){
           return copia;
       } else {
           return null;
       }
    }

    @Override
    public ArrayList<Figurita> buscar(Buscador condicion) {
        ArrayList<Figurita> resultado = new ArrayList<>();
        for(Coleccionable coleccionable: figuritas){
            resultado.addAll(coleccionable.buscar(condicion));
        }
        return resultado;
    }
}
