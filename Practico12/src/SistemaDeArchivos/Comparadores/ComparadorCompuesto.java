package SistemaDeArchivos.Comparadores;

import SistemaDeArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoSA> {
    private Comparator<ElementoSA> ele1, ele2;

    public ComparadorCompuesto(Comparator<ElementoSA> ele1, Comparator<ElementoSA> ele2) {
        this.ele1 = ele1;
        this.ele2 = ele2;
    }

    @Override
    public int compare(ElementoSA elemento1, ElementoSA elemento2) {
        int resultado = ele1.compare(elemento1, elemento2);
        if(resultado == 0){
            return ele2.compare(elemento1,elemento2);
        }
        return resultado;
    }
}

