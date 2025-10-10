package AcademiaVirtual;

import java.util.ArrayList;

public class UnidadOptativa extends Evaluacion {

    private ArrayList<Evaluacion> listaEvaluaciones;

    public UnidadOptativa() {
        this.listaEvaluaciones = new ArrayList<>();
    }

    public void agregarEvaluacion(Evaluacion evaluacion){
        listaEvaluaciones.add(evaluacion);
    }

    @Override
    public double getPuntaje() {
        double total = 0;
        for(Evaluacion e: listaEvaluaciones){
            total += e.getPuntaje();
        }
        return total;
    }

    @Override
    public double tiempoEstimado() {
        double total = 0;
        for(Evaluacion e: listaEvaluaciones){
            total += e.tiempoEstimado();
        }
        return total;
    }

    @Override
    public ArrayList<String> getListado() {
        ArrayList<String> conceptos = new ArrayList<>();
        for (Evaluacion e : listaEvaluaciones) {
            for (String concepto : e.getListado()) {
                if (!conceptos.contains(concepto)) {
                    conceptos.add(concepto);
                }
            }
        }
        return conceptos;
    }
}
