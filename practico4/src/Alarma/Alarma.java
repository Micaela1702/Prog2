package Alarma;

public class Alarma {
    public static void main(String[] args) {
        // Probamos la alarma sonora
        System.out.println("=== Alarma Sonora ===");
        AlarmaSonora alarmaSonora = new AlarmaSonora();

        alarmaSonora.setVidrioRoto(false);
        alarmaSonora.setAbierta(true); // simulo que se abrió una puerta
        alarmaSonora.setDetectoMovimiento(false);

        alarmaSonora.comprobar(); // debería sonar el timbre

        // Probamos la alarma luminosa
        System.out.println("\n=== Alarma Luminosa ===");
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();

        alarmaLuminosa.setVidrioRoto(true); // simulo que se rompió un vidrio
        alarmaLuminosa.setAbierta(false);
        alarmaLuminosa.setDetectoMovimiento(true);

        alarmaLuminosa.comprobar(); // debería sonar el timbre + encender la luz
    }
}

