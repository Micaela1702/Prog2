package AlarmaSensorial;

public class AlarmaSensorial {

    public static void main(String[] args) {
        AlarmaSonora alarma = new AlarmaSonora();

        Sensor puerta = new Sensor("Puerta principal", false);
        Sensor ventana = new Sensor("Ventana cocina", true);
        Sensor movimiento = new Sensor("Living", true);

        alarma.addSensor(puerta);
        alarma.addSensor(ventana);
        alarma.addSensor(movimiento);

        ventana.setActivado(true); // simulo que se abrió una ventana

        alarma.comprobar();
    }
}

