package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionAlquilerMayor extends Condicion{
    private int montoFijo;

    public CondicionAlquilerMayor(int montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.pagoAlquiler(montoFijo);
    }
}
