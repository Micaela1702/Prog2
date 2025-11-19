package HalconesGalacticos.Condiciones;

import HalconesGalacticos.MiembroEquipo;

public class CondicionAND extends Condicion{
    private Condicion con1, con2;

    public CondicionAND(Condicion con1, Condicion con2){
        this.con1 = con1;
        this.con2 = con2;
    }
    @Override
    public boolean cumple(MiembroEquipo miembro) {
        return con1.cumple(miembro) && con2.cumple(miembro);
    }
}
