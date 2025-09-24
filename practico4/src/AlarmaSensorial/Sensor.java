package AlarmaSensorial;

public class Sensor {
   private String zona;
   private boolean activado;

    public Sensor(String zona, boolean activado) {
        this.zona = zona;
        this.activado = activado;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean detectar() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }
}
