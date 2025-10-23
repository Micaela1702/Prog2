package SistemaElectoral.Condiciones;

import SistemaElectoral.Voto;

public class CondicionPorVotoEnBlanco extends Buscador{

    @Override
    public boolean cumple(Voto voto) {
        return voto != null;
    }
}
