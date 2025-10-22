package SistemaDeArchivos;

import SistemaDeArchivos.Condiciones.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comprimido extends Directorio {
    private double tasaCompresion;

    public Comprimido(String nombre, LocalDate fechaCreacion, double tasaCompresion) {
        super(nombre, fechaCreacion);
        this.tasaCompresion = tasaCompresion;
    }

    public double getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(double tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    @Override

    public double calcularTamanio() {
        double tamanioBase = super.calcularTamanio();
        return tamanioBase / tasaCompresion;
    }

    public ArrayList<ElementoSA> buscar(Buscador condicion) {
        ArrayList<ElementoSA> resultado = new ArrayList<>();
        for(ElementoSA elemento : getElementos()){
            if(!elemento.buscar(condicion).isEmpty()){ // cambia porque la consigna pedía que no se agreguen sus subelementos, y que con que uno cumpla alcanza
                resultado.add(this); // entonces si la condicion para ese elemento, no está vacía, me agrego yo como comprimido al resultado
            }
        }
        return resultado;
    }
}
