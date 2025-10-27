package Kiko;

import Kiko.Condiciones.Buscador;

import java.util.ArrayList;

public abstract class Accion {

    public abstract double calcularTiempoEjecucion();
    public abstract double calcularGastoBateria();
    public abstract double getCantidadTarjetas();
    public abstract ArrayList<ComandoSimple>buscar(Buscador condicion);
    public abstract Accion copiar(Buscador condicion);

}
