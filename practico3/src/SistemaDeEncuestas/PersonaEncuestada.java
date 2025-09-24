package SistemaDeEncuestas;

import java.util.ArrayList;

public class PersonaEncuestada {

    private String nombre;
    private String apellido;
    private int DNI;
    ArrayList<EncuestasRealizadas> encuesta;


    public PersonaEncuestada(String nombre, int DNI, String apellido) {
        this.encuesta = new ArrayList<>();
        this.nombre = nombre;
        this.DNI = DNI;
        this.apellido = apellido;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ArrayList<EncuestasRealizadas> getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(ArrayList<EncuestasRealizadas> encuesta) {
        this.encuesta = encuesta;
    }

    // Chequea si ya respondió una encuesta con las mismas preguntas
        public boolean yaRespondio(EncuestasRealizadas nueva) {
            for (EncuestasRealizadas e : encuesta) {
                if (e.getPreguntas().equals(nueva.getPreguntas())) {
                    return true; // misma encuesta
                }
            }
            return false;
        }

        // Intenta responder
        public boolean responderEncuesta(EncuestasRealizadas nueva) {
            if (!yaRespondio(nueva)) {
                encuesta.add(nueva);
            }
            return false; // ya la respondió antes
        }
    }
