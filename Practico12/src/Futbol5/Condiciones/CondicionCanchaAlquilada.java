package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionCanchaAlquilada extends Condicion{
    private int nroCancha;

    public CondicionCanchaAlquilada(int nroCancha){
        this.nroCancha = nroCancha;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.canchaAlquilada(nroCancha);
    }
}
