package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionOR extends Condicion{
    private Condicion cond1, cond2;


    public CondicionOR(Condicion cond1, Condicion cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Socio socio) {
        return cond1.cumple(socio) || cond2.cumple(socio);
    }
}

