package Electronica.Condiciones;

import Electronica.ElementoP;

public class CondicionHogar extends Condicion{
    private String fraseSolicitada;

    public CondicionHogar(String fraseSolicitada) {
        this.fraseSolicitada = fraseSolicitada;
    }

    @Override
    public boolean cumple(ElementoP elemento) {
        return elemento.getNombre().contains(fraseSolicitada);
    }
}
