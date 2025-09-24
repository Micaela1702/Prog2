package Alarma;

public class AlarmaSonora {
    private boolean vidrioRoto;
    private boolean abierta;
    private boolean detectoMovimiento;
    protected Timbre timbre;

    public AlarmaSonora() {
        this.vidrioRoto = false;
        this.abierta = false;
        this.detectoMovimiento = false;
        this.timbre = new Timbre();
    }

    public boolean getVidrioRoto() {
        return vidrioRoto;
    }

    public boolean getAbierta() {
        return abierta;
    }

    public boolean getDetectoMovimiento() {
        return detectoMovimiento;
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public void setDetectoMovimiento(boolean detectoMovimiento) {
        this.detectoMovimiento = detectoMovimiento;
    }

    public void comprobar() {
        if (vidrioRoto || abierta || detectoMovimiento) {
            timbre.activarSenialSonora();
        }
    }
}
