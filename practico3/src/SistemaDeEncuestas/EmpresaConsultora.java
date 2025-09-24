package SistemaDeEncuestas;

import java.util.ArrayList;

public class EmpresaConsultora {

    ArrayList<EncuestasRealizadas> encuestasRealizadas;
    ArrayList<Empleado> empleados;
    private double valorPorEncuesta;

    public EmpresaConsultora(int idEncuesta){
        this.encuestasRealizadas = new ArrayList<>();
        this.empleados = new ArrayList<>();

    }

    public int getCantidadEncuestasPorEmpleado(Empleado e1){
       return e1.getEncuestasRealizadas(); // consultar.
    }

    public double calcularPlus(Empleado e1){
        return e1.getSueldo() + e1.getEncuestasRealizadas() * valorPorEncuesta; // primero calcula lo que gana por encuesta, y luego se le
                                                                                // suma el sueldo del empleado.
    }

    public ArrayList<EncuestasRealizadas> getEncuestasRealizadas(){
        return encuestasRealizadas;
    }

    public void agregarEmpleado(Empleado e1){
        if(!empleados.contains(e1)) {
            empleados.add(e1);
        }
    }

    public void agregarEncuesta(EncuestasRealizadas er){
       encuestasRealizadas.add(er);
    }

}
