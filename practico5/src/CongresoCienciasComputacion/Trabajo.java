package CongresoCienciasComputacion;

import java.util.ArrayList;

public class Trabajo {
    private String tema;
    private ArrayList<String> palabrasClaves;
    private Evaluador evaluador;


    public Trabajo(String tema, Evaluador evaluador) {
        this.tema = tema;
        this.palabrasClaves = new ArrayList<>();
        this.evaluador = evaluador;
    }

    /* public boolean esAptoPara(Trabajo trabajo) {
        return trabajo.esApto(this);
    } */

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }
}
