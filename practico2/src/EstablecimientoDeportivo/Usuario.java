package EstablecimientoDeportivo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String DNI;
    private ArrayList<Turno> turnosReservados;


    public Usuario(String nombre, String DNI){

        this.nombre = nombre;
        this.DNI = DNI;
        this.turnosReservados = new ArrayList<Turno>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public ArrayList<Turno> getTurnosReservados(){
        return turnosReservados;
    }
    public void agregarTurno(Turno tr){
        turnosReservados.add(tr);
    }

    public boolean esSocio() {
        // 1. Calcular la fecha de referencia: hoy menos 2 meses
        LocalDateTime haceDosMeses = LocalDateTime.now().minusMonths(2);

        // 2. Contador de turnos en los últimos dos meses
        int contador = 0;

        // 3. Recorremos todos los turnos del usuario
        for (Turno tr : turnosReservados) {
            // 4. Si la fecha de inicio del turno es posterior a haceDosMeses,
            //    significa que el turno fue dentro de los últimos 2 meses
            if (tr.getInicio().isAfter(haceDosMeses)) {
                contador++; // sumamos 1 al contador
            }
        }

        // 5. El usuario será socio si tiene 4 o más turnos en los últimos 2 meses
        return contador >= 4;
    }
    @Override
    public String toString() {
        return "Usuario: " + nombre + " | DNI: " + DNI +
                " | Socio: " + (esSocio() ? "Sí" : "No");
    }
}

