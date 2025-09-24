package AgendaPersonal;

import java.util.ArrayList;

public class agendaPersonal {
    private ArrayList<Reunion> reuniones;

    public agendaPersonal() {
        this.reuniones = new ArrayList<>();
    }

    public void agregarReunion(Reunion r1) {
        if (estaOcupado(r1)) {
            System.out.println("no se puede agregar la reunión");
        } else {
            reuniones.add(r1);
        }
    }

    public boolean estaOcupado(Reunion r1) {

        for (Reunion rr : reuniones) {
            if (rr.gethoraFin() > r1.gethoraInicio() && rr.gethoraInicio() < r1.gethoraFin()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Reunion> getReuniones(){
        return reuniones;
    }

}
