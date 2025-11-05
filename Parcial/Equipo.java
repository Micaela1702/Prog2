package Parcial;

import Parcial.Condicion.Condicion;

import java.util.ArrayList;


public class Equipo extends Persona{
    protected ArrayList<Persona>lista;

    public Equipo() {
        this.lista=new ArrayList<>();
    }

    public void agregar(Persona persona){
        lista.add(persona);
    }

    public boolean tengoAlgo(){
        return !lista.isEmpty();
    }

    @Override
    public int calculoGanancia() {
        int total=0;
        for (Persona persona : lista) {
            total+=persona.calculoGanancia();
        }
        return total;
    }

    @Override
    public ArrayList<Vendedor> buscar(Condicion condicion) {
        ArrayList<Vendedor>resultado=new ArrayList<>();
        for (Persona persona : lista) {
            resultado.addAll(persona.buscar(condicion));
        }
        return resultado;
    }

    @Override
    public Persona copiar(Condicion condicion) {
        Equipo copia=new Equipo();

        for (Persona persona : lista) {
            Persona copiaHija=persona.copiar(condicion);

            if (copiaHija!=null) {
                copia.agregar(copiaHija);
            }
        }

        if (copia.tengoAlgo()) { 
            return copia;
        }
        else{
            return null;
        }
    }

    @Override
    public int getEdad(){
        int sumaEdades=0;
        for (Persona persona : lista) {
            sumaEdades+=persona.getEdad();
        }
        return sumaEdades/lista.size();
    }
}
