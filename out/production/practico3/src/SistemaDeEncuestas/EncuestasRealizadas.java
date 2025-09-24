package SistemaDeEncuestas;

import AgendaPersonal.Persona;

import java.util.ArrayList;

public class EncuestasRealizadas {

    private PersonaEncuestada encuestada; // asocia a una sola persona, con la encuesta
    ArrayList<Pregunta> preguntas;
    ArrayList<Respuesta> respuestas;
    private Empleado empleado;
    private int id_encuesta; // id encuesta

    public EncuestasRealizadas(PersonaEncuestada encuestada, Empleado empleado) {
        this.id_encuesta = encuestada.getDNI();
        this.encuestada = encuestada;
        this.preguntas = new ArrayList<>();
        this.respuestas = new ArrayList<>();
        this.empleado = empleado;
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public ArrayList<Pregunta> getPreguntas() { // copia de el ArrayList
        return new ArrayList<>(preguntas);
    }

    public void agregarPregunta(Pregunta p){
        preguntas.add(p);
    }

    public void agregarRespuestas(Respuesta r1){
        if(respuestas.size() < preguntas.size()){
            respuestas.add(r1);
        } else {
            System.out.println("la encuesta está completa");
        }
    }

    public ArrayList<Respuesta> getRespuestas() {
        return new ArrayList<>(respuestas); // así no se puede modificar la lista original.
    }


    public PersonaEncuestada getEncuestada(){
        return encuestada;
    }

    public boolean estaCompleta(){
        return preguntas.size() == respuestas.size();
    }

    @Override
    public String toString() {
        return "Encuesta realizada por " + encuestada.getNombre() +
                " (DNI: " + encuestada.getDNI() +
                "), Empleado: " + empleado.getNombre() +
                ", Preguntas: " + preguntas.size() +
                ", Respuestas: " + respuestas.size();
    }

}

