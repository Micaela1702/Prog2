package HalconesGalacticos.Condiciones;

import HalconesGalacticos.MiembroEquipo;

public class CondicionMetal extends Condicion{
    private String metal;

    public CondicionMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public boolean cumple(MiembroEquipo miembro) {
        return miembro.getMetalesFavoritos().contains(metal);
    }
}
