package Aseguradora;

import java.util.ArrayList;

public class SeguroIntegrador extends Cartera {
    private String dniCliente;
    private ArrayList<Cartera> seguros;


    public SeguroIntegrador(String dniCliente) {
        this.dniCliente = dniCliente;
        this.seguros = new ArrayList<>();
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    @Override
    public double calcularCostoPoliza() { // por cada seguro, recorro la lista recursivamente de las clases compuestas y acumulo el cálculo
                                          // de cada costo de su póliza.
        double contador=0;
        for(Cartera costo: seguros){
            contador+=costo.calcularCostoPoliza();
        }
        return contador;
    }

    @Override
    public double getMontoAsegurado() {
       double monto=0;
       for(Cartera seguro: seguros){
           monto += seguro.getMontoAsegurado();
       }
       return monto;
    }

    @Override
    public int getNumeroPoliza() {
        int polizaMayor = 0;
        for(Cartera seguro: seguros){
            if(seguro.getNumeroPoliza() > polizaMayor){
                polizaMayor = seguro.getNumeroPoliza();
            }
        }
        return polizaMayor;
    }
}
