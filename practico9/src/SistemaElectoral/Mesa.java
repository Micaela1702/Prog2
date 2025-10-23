package SistemaElectoral;

import SistemaElectoral.Condiciones.Buscador;

import java.util.ArrayList;

public class Mesa extends Votacion {
    private ArrayList<Integer> DNI;
    private ArrayList<Voto> votos;


    public Mesa() {
        this.DNI = new ArrayList<>();
        this.votos = new ArrayList<>();
    }

    public void controlDeVotos(Voto voto, int dni){
        if(DNI.contains(dni)){
            votos.add(voto);
        }
    }

    @Override
    public double buscar(Buscador condicion) {
        double totalVotos = 0;
        for (Voto voto : votos) {
            if (condicion.cumple(voto)) {
                totalVotos += voto.cantidadVotos();
            }
        }
        return totalVotos;
    }

    @Override
    public double cantidadVotos() {
        return votos.size();
    }
}
