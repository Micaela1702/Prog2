package Vivero.Condiciones;

import Vivero.Planta;

public class CondicionC extends Buscador{

    private String clasificacion = "Crassula";


    public CondicionC(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean cumple(Planta planta) { // revisar
        return planta.getClasificacionSuperior().equals(clasificacion);
    }
}
