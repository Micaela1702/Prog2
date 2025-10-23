package SistemaElectoral;

import SistemaElectoral.Condiciones.Buscador;

import java.util.ArrayList;

public class LugarVotacion extends Votacion {
    private String nombre;
    private ArrayList<Votacion> lugarVotacion; // hereda de votación porque es la que tiene las mesas y los votos


    public LugarVotacion(String nombre) {
        this.nombre = nombre;
        this.lugarVotacion = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double buscar(Buscador condicion) {
        double contador=0;
        for(Votacion votacion: lugarVotacion){
            contador += votacion.buscar(condicion); // vuelve recursivamente a contar la cantidad de votos/ mesas que hay en la clase abstracta
        }
        return contador;
    }

    @Override
    public double cantidadVotos() {
        double contador=0;
        for (Votacion votacion: lugarVotacion){
            contador += votacion.cantidadVotos(); // almacena en un contador la cantidad de votos de las mesas o de los votos (por eso referencia a la clase abstracta)
        }
        return contador;
    }
}
