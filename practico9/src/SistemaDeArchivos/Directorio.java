package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ElementoSA {
    private ArrayList<ElementoSA> elementos;

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.elementos = new ArrayList<>();
    }

    public void agregarElementos(ElementoSA elemento){
        elementos.add(elemento);
    }

    public ArrayList<ElementoSA> getElementos() {
        return new ArrayList<>(elementos); // defensivo
    }

    @Override
    public double calcularTamanio() {
        double tamanioTotal=0;
        for(ElementoSA elemento: elementos){
            tamanioTotal+=elemento.calcularTamanio();
        }
        return tamanioTotal;
    }
}
