package SeleccionDeFutbol;

import java.util.ArrayList;

public class Contingente {
    private ArrayList<Integrante> integrantes;


    public Contingente(){
        this.integrantes = new ArrayList<>();
    }


    public void agregarIntegrante(Integrante i){ // revisar
        for(Integrante in : integrantes){
            if(!(in.getPasaporte().equals(i.getPasaporte()))){
               return;
            }
        }
        integrantes.add(i);
    }
}
