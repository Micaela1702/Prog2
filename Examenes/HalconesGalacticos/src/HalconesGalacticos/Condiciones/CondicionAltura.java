package HalconesGalacticos.Condiciones;

import HalconesGalacticos.MiembroEquipo;

public class CondicionAltura extends Condicion{
    private double altura;

    public CondicionAltura(double altura){
        this.altura = altura;
    }
    @Override
    public boolean cumple(MiembroEquipo miembro) {
        return miembro.getAltura() < altura;
    }
}
