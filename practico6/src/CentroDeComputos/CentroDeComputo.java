package CentroDeComputos;

public class CentroDeComputo {
    private String nombre;

    private ColaPorPrioridad computadoras;
    private ColaPorPrioridad procesos;

    public CentroDeComputo(String nombre) {
        this.nombre = nombre;
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