package AlarmaSensorial;

import java.util.ArrayList;

public class AlarmaSonora {
    ArrayList<Sensor> sensores;
    protected Timbre timbre;
    protected Luz alarmaLuz;

    public AlarmaSonora() {
        this.sensores = new ArrayList<>();
        this.timbre = new Timbre();
        this.alarmaLuz = new Luz();
    }

    public void addSensor(Sensor a) {
        sensores.add(a);
    }

    public void comprobar() {
        boolean activo=false;
        for (Sensor s : sensores) {
            if (s.detectar()) {
                System.out.println("Alerta en la zona: " + s.getZona());
                activo = true;
            }
        }
        if (activo){
            timbre.activarSenialSonora();
            alarmaLuz.encender();
        } else {
            alarmaLuz.apagar();
        }
    }
}
