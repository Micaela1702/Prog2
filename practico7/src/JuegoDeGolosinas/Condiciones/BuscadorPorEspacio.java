package JuegoDeGolosinas.Condiciones;

import JuegoDeGolosinas.Ficha;

public class BuscadorPorEspacio extends Buscador{
    private double espacio;


    public BuscadorPorEspacio(double espacio) {
        this.espacio = espacio;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getEspacio() > espacio;
    }
}
