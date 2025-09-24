package Alarma;

public class AlarmaLuminosa extends AlarmaSonora {
    protected Luz luz;


    public AlarmaLuminosa() {
        super(); // llamó al constructor de alarma luminosa (clase padre)
        this.luz = new Luz();
    }


    public void activarSenialSonora() {
        super.comprobar();
        if (hayAlerta()) {
            luz.encender();
        } else {
            luz.apagar();
        }
    }

    public boolean hayAlerta() {
        return getVidrioRoto() || getAbierta() || getDetectoMovimiento();
    }
}