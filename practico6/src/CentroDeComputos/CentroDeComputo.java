package CentroDeComputos;

import PuertoDeCereales.ColaPrioridad;

public class CentroDeComputo {
    private String nombre;

    private ColaPorPrioridad computadoras;
    private ColaPorPrioridad procesos;

    public CentroDeComputo(String nombre) {
        this.nombre = nombre;
        this.computadoras = new ColaPorPrioridad();
        this.procesos = new ColaPorPrioridad();
    }

    public void agregarComputadora(Computadora c){
        if(procesos.estaVacioElProceso()) {
            computadoras.agregarComputadoraOrdenada(c);
        } else {
           c.asignoProceso((procesos.dameSiguienteProceso()));
        }
    }

    public void agregarProceso(Proceso p){
        if(computadoras.estaVacio()){
            procesos.agregarProcesoOrdenado(p);
        } else {
            computadoras.dameSiguiente();
        }
    }
}