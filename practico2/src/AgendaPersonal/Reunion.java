package AgendaPersonal;
import java.util.ArrayList;

public class Reunion {
    private ArrayList<Persona> participantes;
    private String lugarReunion;
    private String tema;
    private double duracion;
    private double horaInicio;
    private double horaFin;


    public Reunion (String lugarReunion, String tema, double duracion, double horaInicio, double horaFin){
        this.participantes = new ArrayList<>();
        this.lugarReunion = lugarReunion;
        this.tema = tema;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Reunion(){
        this("Oficina 3", "Gastos Empresariales", 0, 0, 0);
    }

    public void agregarParticipante(Persona p){
        participantes.add(p);
    }

    public String getlugarReunion(){
        return lugarReunion;
    }

    public String getTema(){
        return tema;
    }
    public double getDuracion(){
        return horaFin - horaInicio;
    }

    public double gethoraInicio(){
        return horaInicio;
    }

    public double gethoraFin(){
        return horaFin;
    }

    public void sethoraInicio(double horaInicio){
        if (horaInicio > 0){
            this.horaInicio = horaInicio;
        }
    }
    public void sethoraFin(double horaFin){
        if (horaFin > 0 && horaFin > horaInicio){
            this.horaFin = horaFin;
        }
     }

     public ArrayList<Persona> getParticipantes(){
        return participantes;
     }

    @Override
    public String toString() {
        return "Reunión en " + lugarReunion +
                " sobre '" + tema + "'" +
                " de " + horaInicio + " a " + horaFin +
                " (duración: " + getDuracion() + " horas)";
    }
}

