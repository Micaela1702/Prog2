package Vivero.Condiciones;

import Vivero.Planta;

import java.util.ArrayList;

public class CondicionB extends Buscador {
    private String palabra;

    @Override
    public boolean cumple(Planta planta) {
        ArrayList<String> copiaNombres = planta.getNombresVulgares();
        for(String p: copiaNombres){
            if(p.equals(palabra)){
                return true;
            }
        }
        return false;
    }
}
