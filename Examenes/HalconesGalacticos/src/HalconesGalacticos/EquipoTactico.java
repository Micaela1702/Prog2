package HalconesGalacticos;

import HalconesGalacticos.Condiciones.Condicion;

import java.util.ArrayList;

public class EquipoTactico extends Elemento {
    protected ArrayList<Elemento> elementos;


    public void addElemento(Elemento e) {
        if (!elementos.contains(e)) {
            elementos.add(e);
        }
    }

    @Override
    public double getTalle() {
        double talleMenor = 0;
        for (Elemento e : elementos) {
            if (e.getTalle() < talleMenor) {
                talleMenor = e.getTalle();
            }
        }
        return talleMenor;
    }

    @Override
    public ArrayList<String> getMetales() {
        ArrayList<String> resultado = new ArrayList<>();
        for (Elemento e : elementos) {
            for (String metal : e.getMetales()) {
                if (!resultado.contains(metal)) {
                    resultado.addAll(e.getMetales());
                }
            }
        }
        return resultado;
    }

}
