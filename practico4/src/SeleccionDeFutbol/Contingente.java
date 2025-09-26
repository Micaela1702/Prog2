package SeleccionDeFutbol;

import java.util.ArrayList;

public class Contingente {
    private ArrayList<Integrante> integrantes;


    public Contingente(){
        this.integrantes = new ArrayList<>();
    }

    public void agregarIntegrante(Integrante i){
        if (!integrantes.contains(i)){ // si no contiene agrego
            integrantes.add(i);
        }
    }
    public ArrayList<Integrante> getIntegrantes(){
        return new ArrayList<>(integrantes); // copia de el ArrayList
    }
}
