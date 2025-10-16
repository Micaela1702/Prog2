package JuegoDeGolosinas;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Ficha> fichas;
    private double puntajeMin;

    public Tablero(double puntajeMin) {
        this.fichas = new ArrayList<>();
        this.puntajeMin = puntajeMin;
    }

    public double calcularDificultad(){
        double sumaTotal = 0;
        double poderDestruccionTotal = 0;
        for (Ficha f: fichas){
            sumaTotal += f.getFortaleza();
            poderDestruccionTotal += f.getPoderDestruccion();
        }
        return poderDestruccionTotal == 0 ? Double.POSITIVE_INFINITY : sumaTotal / poderDestruccionTotal; // lo proteje de la división por 0
    }

    public void agregarFicha(Ficha ficha){
        if(!fichas.contains(ficha)){
            fichas.add(ficha);
        }
    }

    public double getPuntajeMin() {
        return puntajeMin;
    }

    public void setPuntajeMin(double puntajeMin) {
        this.puntajeMin = puntajeMin;
    }

    public ArrayList<Ficha>buscarFichas(Buscador buscador){ // el tablero le delega la busqueda de las fichas que cumplen, al buscador
        ArrayList<Ficha> fichasResultado = new ArrayList<>();
        for (Ficha f: fichas) {
            if(buscador.cumple(f)){
                fichasResultado.add(f);
            }
        }
        return fichasResultado;
    }
}