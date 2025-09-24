package SistemaDeEncuestas;

import java.util.ArrayList;

public class Pregunta {
    private String tema;
    ArrayList<Respuesta> respuestas;


    public Pregunta (String tema){
        this.respuestas = new ArrayList<>();
        this.tema = tema;
    }


    public void agregarRespuestas(Respuesta r){
        respuestas.add(r);
    }


}
