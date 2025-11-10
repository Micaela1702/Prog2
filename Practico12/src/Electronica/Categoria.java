package Electronica;

import java.util.ArrayList;

public class Categoria extends ElementoP {
    private String nombre;
    private ArrayList<ElementoP> elementos;
    private final int maxPalabrasClave;
    private ArrayList<String> palabrasClave;

    public Categoria(int maxPalabrasClave) {
        this.maxPalabrasClave = maxPalabrasClave;
    }

    public void agregarPalabraClave(String palabra){
        if(!palabrasClave.contains(palabra)){
            palabrasClave.add(palabra);
        }
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
    public double getCantidadProductos() {
        double cantidadTotalProductos = 0;
        for (ElementoP elemento : elementos) {
            cantidadTotalProductos += elemento.getCantidadProductos();
        }
        return cantidadTotalProductos;
    }

    @Override
    public int getPalabrasClave() {
        String palabraClave = "tu vieja";
        for (int i = maxPalabrasClave; i > 0; i--) {
            agregarPalabraClave(palabraClave);
        }
        return -1;
    }
}
