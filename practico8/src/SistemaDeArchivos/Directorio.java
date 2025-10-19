package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ElementoSA { // clase compuesta
    private ArrayList<ElementoSA> elementos;



    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.elementos = new ArrayList<>();

    }

    public void agregarElemento(ElementoSA elementoSA){
        if(!elementos.contains(elementoSA)){
            elementos.add(elementoSA);
        }
    }

    public int getCantElementos(){
        return elementos.size();
    }

    @Override
    public double calcularTamanio() {
        double tamanioTotal=0;
        for(ElementoSA elemento: elementos){
            tamanioTotal+= elemento.calcularTamanio();
        }
        return tamanioTotal;
    }

}
