package HalconesGalacticos;

import HalconesGalacticos.Condiciones.Condicion;

import java.util.ArrayList;

public class EquipoTactico extends Elemento{
    private ArrayList<Elemento> elementos;

    @Override
    public double getTalle() {
        return 0;
    }

    @Override
    public ArrayList<String> getMetales() {
        return null;
    }

    @Override
    public ArrayList<Traje> buscar(Condicion condicion) {
        return null;
    }
}
