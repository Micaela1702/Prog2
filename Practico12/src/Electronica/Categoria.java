package Electronica;

import Electronica.Condiciones.Condicion;

import java.util.ArrayList;

public class Categoria extends ElementoP {
    private String nombre;
    private ArrayList<ElementoP> elementos;
    private int maxPalabrasClave;
    private ArrayList<String> palabrasClave;


    public Categoria(String nombre,int maxPalabrasClave) {
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
        this.maxPalabrasClave = maxPalabrasClave;
        this.palabrasClave = new ArrayList<>();
    }

    public void agregarPalabraClave(String palabra){
        if(!palabrasClave.contains(palabra)){
            palabrasClave.add(palabra);
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getValor() {
        double valorTotal = 0;
        for (ElementoP elemento : elementos) {
            valorTotal += elemento.getValor();
        }
        return valorTotal;
    }

    @Override
    public double getCantidadProductosEnStock() {
        double totalStock=0;
        for(ElementoP elemento: elementos){
            totalStock+=elemento.getCantidadProductosEnStock();
        }
        return totalStock;
    }

    @Override
        public ArrayList<String> getPalabrasClave(){
        ArrayList<String> resultado = new ArrayList<>();
        // recorro los elementos
        for(String palabra: palabrasClave) {
            if (!palabrasClave.contains(palabra)) {
                palabrasClave.add(palabra); // si no está repetida, la agrego
            }
        }
        int desde=palabrasClave.size()-maxPalabrasClave; // obtengo la diferencia entre el tamaño del array y el máximo que me dan,
                                                        // y recorro y agrego desde esa diferencia hasta el final.
        for (int i = desde; i < palabrasClave.size(); i++) {
            resultado.add(palabrasClave.get(i));
        }
        return resultado;
    }

    @Override
    public ArrayList<ElementoP> buscar(Condicion condicion) {
        ArrayList<ElementoP> resultado = new ArrayList<>();
        for(ElementoP elemento: elementos){
            elementos.addAll(elemento.buscar(condicion));
        }
        return resultado;
    }
}
