package CentroDeComputos;

import java.util.ArrayList;

public class ColaPorPrioridad {
    private ArrayList<Proceso> procesos;
    private ArrayList<Computadora> computadoras;


    public ColaPorPrioridad() {
        this.procesos = new ArrayList<>();
        this.computadoras = new ArrayList<>();
    }

    public void agregarComputadoraOrdenada(Computadora c) {
        int i = 0;
        while (i < computadoras.size() && c.getVelocidad() < computadoras.get(i).getVelocidad()) {
            i++;
        }
        computadoras.add(i, c);
    }

    public Computadora dameSiguiente(){
        return computadoras.remove(0);
    }

    public Proceso dameSiguienteProceso(){
        return procesos.remove(0);
    }

    public void agregarProcesoOrdenado(Proceso p) {
        int i = 0;
        while (i < procesos.size() && p.getReqMemoria() < procesos.get(i).getReqMemoria()) {
            i++;
        }
        procesos.add(i, p);
    }

    public boolean estaVacioElProceso(){
        return procesos.isEmpty();
    }
    public boolean estaVacio(){
        return computadoras.isEmpty();
    }

}
