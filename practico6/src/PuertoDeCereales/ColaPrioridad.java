package PuertoDeCereales;

import java.util.ArrayList;

public class ColaPrioridad {
    private ArrayList<Barco> barcos;
    private ArrayList<Camion> camiones;


    public ColaPrioridad() {
        this.barcos = new ArrayList<>();
        this.camiones = new ArrayList<>();
    }

    public void agregar(Barco barco) {
        int i = 0;
        while (i < barcos.size() && barco.getCapacidad() > barcos.get(i).getCapacidad()) {
            i++;
        }
        barcos.add(i, barco);
    }

    public void agregarCamion(Camion camion) {
        int i = 0;
        while (i < camiones.size() && camion.getFechaCargamento().isAfter(camiones.get(i).getFechaCargamento())) {
            i++;
        }
        camiones.add(i, camion);
    }

    public void descargar(Camion camion) {
        if (!camion.estaVacio()) {
            camiones.remove(0);
        }
    }

    public Camion obtenerCamionPrioritario() {
        if (!camiones.isEmpty()) {
            return camiones.remove(0);
        }
        return null;
    }
}
