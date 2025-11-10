package Electronica.Condiciones;

import Electronica.ElementoP;

public class CondicionPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionPalabraClave(String palabraClave){
        this.palabraClave = palabraClave;
    }
    @Override
    public boolean cumple(ElementoP elemento) {
        return elemento.();
    }
}
