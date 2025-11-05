package Futbol5;

import java.util.ArrayList;
import java.util.Comparator;

public class SistemaGestionSocios {
    private ArrayList<Socio> socios;


    public SistemaGestionSocios(){
        this.socios = new ArrayList<>();
    }

    public void agregarSocio(Socio s){
        socios.add(s);
    }

    public ArrayList<Socio> ordenarPorCondicion(Condicion c, Comparator<Socio> comp){
        ArrayList<Socio> resultado = new ArrayList<>();
        for(Socio s: socios) {
            if (c.cumple(s)) {
                resultado.add(s);
            }
        }

        Collection.sort(resultado, comp);
        return resultado;
    }

}
