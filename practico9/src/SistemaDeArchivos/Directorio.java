package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ElementoSA {
    private ArrayList<ElementoSA> elementos;

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.elementos = new ArrayList<>();
    }

    public void agregarElementos(ElementoSA elemento) {
        elementos.add(elemento);
    }

    public ArrayList<ElementoSA> getElementos() {
        return new ArrayList<>(elementos); // defensivo
    }

    @Override
    public double calcularTamanio() {
        double tamanioTotal = 0;
        for (ElementoSA elemento : elementos) {
            tamanioTotal += elemento.calcularTamanio();
        }
        return tamanioTotal;
    }

    public ArrayList<ElementoSA> buscar(Buscador condicion) {
        ArrayList<ElementoSA> resultado = new ArrayList<>();
        if (condicion.cumple((this))) { // si yo como elemento, cumplo, me agrego
            resultado.add(this);
        }
        for (ElementoSA elemento : elementos) { // como tiene elementos internos, debo preguntar si cada elemento, cumple con la condición
            resultado.addAll(elemento.buscar(condicion));
        }
        return resultado;
    }
}

