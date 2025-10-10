package AcademiaVirtual;

import java.util.ArrayList;

public class Pregunta extends Evaluacion {
    private String enunciado;
    private double puntaje;
    private double tiempoEstimado;
    private ArrayList<String> conceptosLista;

    public Pregunta(String enunciado, double puntaje, double tiempoEstimado) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempoEstimado = tiempoEstimado;
        this.conceptosLista = new ArrayList<>();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    @Override
    public double getPuntaje() {
        return this.puntaje;
    }

    @Override
    public double tiempoEstimado() {
        return this.tiempoEstimado;
    }

    @Override
    public ArrayList<String> getListado() {
        ArrayList<String> conceptos = new ArrayList<>();
        for (String concepto : conceptosLista) {
            if (!conceptosLista.contains(concepto)) {
                conceptosLista.add(concepto);
            }
        }
    return conceptos;
    }
}
