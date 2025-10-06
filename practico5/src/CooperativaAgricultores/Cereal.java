package CooperativaAgricultores;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> minerales;

    public Cereal(String nom){
        this.nombre = nom;
        this.minerales = new ArrayList<>();

    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // funcionalidades

    public boolean esApto(Lote lote){ // recorre la lista de minerales y va consultando si tiene el mineral necesario para
                                      // poder sembrar, sino no es apto.
        for (String mineral : minerales) {
            if (!lote.tieneMineral(mineral)) {
                return false;
            }
        }
        return true;
    }

    public void agregarMineral(String nuevoMineral) { // controla repetidos
        String nuevoMinuscula = nuevoMineral.toLowerCase();
        if (!this.minerales.contains(nuevoMinuscula)) {
            this.minerales.add(nuevoMinuscula);
        }
    }

    public boolean equals(Object otro) {
        try {
            Cereal otroCereal = (Cereal) otro;
            return this.getNombre().equalsIgnoreCase(otroCereal.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    public String toString(){
        return this.getNombre();
    }
}
