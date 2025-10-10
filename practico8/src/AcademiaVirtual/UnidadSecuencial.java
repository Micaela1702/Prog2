package AcademiaVirtual;

import java.util.ArrayList;

public class UnidadSecuencial extends Evaluacion {

    private ArrayList<Evaluacion> listaEvaluaciones;

    public UnidadSecuencial() {
        this.listaEvaluaciones = new ArrayList<>();
    }

    public void agregarEvaluacion(Evaluacion evaluacion){
        listaEvaluaciones.add(evaluacion);
    }

    @Override
    public double getPuntaje() {
        double puntajeMayor=0;
        for (Evaluacion e : listaEvaluaciones) {
            if (e.getPuntaje() > puntajeMayor) {
                puntajeMayor = e.getPuntaje();
            }
        }
        return puntajeMayor;
    }

    @Override
    public double tiempoEstimado() {
        double tiempoMayorEstimado=0;
        for(Evaluacion e: listaEvaluaciones){
            if(e.tiempoEstimado() > tiempoMayorEstimado){
                tiempoMayorEstimado = e.tiempoEstimado();
            }
        }
        return tiempoMayorEstimado;
    }

    @Override
    public ArrayList<String> getListado() {
        ArrayList<String> conceptos = new ArrayList<>();
        for(Evaluacion e : listaEvaluaciones){
            for (String concepto : e.getListado()){
                if(!conceptos.contains(concepto)){
                    conceptos.add(concepto);
                }
            }
        }
        return conceptos;
    }
}
