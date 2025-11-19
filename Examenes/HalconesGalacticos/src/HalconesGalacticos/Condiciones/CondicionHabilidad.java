package HalconesGalacticos.Condiciones;

import HalconesGalacticos.MiembroEquipo;

public class CondicionHabilidad extends Condicion {
    private String habilidad;

    public CondicionHabilidad(String habilidad){
        this.habilidad = habilidad;
    }

    @Override
    public boolean cumple(MiembroEquipo miembro) {
        return miembro.getHabilidadPrincipal().equals(habilidad);
    }
}
