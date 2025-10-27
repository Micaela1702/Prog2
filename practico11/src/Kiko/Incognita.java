package Kiko;

import Kiko.Condiciones.Buscador;

import java.util.ArrayList;

public class Incognita extends ComandoSimple{

    public Incognita(String instruccion, double gastoDeBateria, double tiempoEjecucion) {
        super(instruccion, gastoDeBateria, tiempoEjecucion);
    }

    @Override
    public ArrayList<ComandoSimple> buscar(Buscador condicion) {
        return null;
    }

    @Override
    public Accion copiar(Buscador condicion) {
        return null;
    }
}
