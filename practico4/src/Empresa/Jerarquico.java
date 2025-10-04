package Empresa;

import java.util.ArrayList;

public class Jerarquico extends Empleado {
    private ArrayList<Empleado> empleadosACargo;

    public Jerarquico(String nombre, String apellido, String cargo, int edad, int legajo, double sueldo) {
        super(nombre, apellido, cargo, edad, legajo, sueldo);
        this.empleadosACargo = new ArrayList<>();

    }

    public void agregarEmpleado(Empleado e) {
        if (!empleadosACargo.contains(e)) {
            empleadosACargo.add(e);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Se empieza armando el encabezado con los datos básicos del jerárquico
        sb.append("Jerárquico - ")
                .append(nombre).append(" ").append(apellido)
                .append(" (").append(edad).append(" años)")
                .append(", Cargo: ").append(cargo)
                .append(", Legajo: ").append(legajo)
                .append(", Sueldo: $").append(sueldo);

        // Si el jerárquico tiene empleados a cargo...
        if (!empleadosACargo.isEmpty()) {
            sb.append("\n   Empleados a cargo:");
            // Recorremos la lista y mostramos cada uno con sangría
            for (Empleado e : empleadosACargo) {
                sb.append("\n     - ")
                        .append(e.nombre).append(" ").append(e.apellido);
            }
        }

        // Convertimos todo el StringBuilder en un String final
        return sb.toString();
    }

}
