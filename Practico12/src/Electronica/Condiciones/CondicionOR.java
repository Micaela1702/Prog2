package Electronica.Condiciones;

import Electronica.ElementoP;

public class CondicionOR extends Condicion {
    private Condicion cond1, cond2;


    public CondicionOR(Condicion cond1, Condicion cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(ElementoP elemento) {
        return cond1.cumple(elemento) || cond2.cumple(elemento);
    }
}

