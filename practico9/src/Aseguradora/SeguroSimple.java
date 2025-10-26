package Aseguradora;

import Aseguradora.Calculadores.CalcularCosto;
import Aseguradora.Condiciones.Buscador;

import java.util.ArrayList;

public class SeguroSimple extends Cartera {

    private int numeroPoliza;
    private String descripcion;
    private double montoAsegurado;
    private int dniTitular;
    private CalcularCosto calcular;

    public SeguroSimple(int numeroPoliza, String descripcion, double montoAsegurado, int dniTitular, CalcularCosto calcular) {
        this.numeroPoliza = numeroPoliza;
        this.descripcion = descripcion;
        this.montoAsegurado = montoAsegurado;
        this.dniTitular = dniTitular;
        this.calcular = calcular;
    }

    @Override
    public double calcularCostoPoliza() {
        return calcular.calcularPoliza(this); // se calcula cualquier seguro simple.
    }

    public int getNumeroPoliza() {  // lo calcula con sus atributos
        return numeroPoliza;
    }

    @Override
    public ArrayList<SeguroSimple> buscar(Buscador condicion) {
        ArrayList<SeguroSimple> resultado = new ArrayList<>();
        if (condicion.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public int getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(int dniTitular) {
        this.dniTitular = dniTitular;
    }

    public boolean tienePalabra(String palabra){
        return descripcion.contains(palabra);
    }

}
