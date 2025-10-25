package Aseguradora;

import Aseguradora.Condiciones.Buscador;

import java.util.ArrayList;

public abstract class Cartera {


    public abstract double calcularCostoPoliza();
    public abstract double getMontoAsegurado();
    public abstract int getNumeroPoliza();
    public abstract ArrayList<SeguroSimple> buscar(Buscador condicion);
}
