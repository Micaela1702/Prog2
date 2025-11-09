package WorkBreakDownStructure;

import WorkBreakDownStructure.Condiciones.Condicion;

import java.time.LocalDate;

import java.time.Period;
import java.util.ArrayList;

public class TareaCompuesta extends Tarea{
    ArrayList<Tarea> tareas;
    Period diferencia = Period.between(getFechaInicio(), getFechaFin());


    public TareaCompuesta() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea t){
        tareas.add(t);
    }

    @Override
    public LocalDate getFechaInicio() {
        if(tareas.isEmpty()){
            return null;
        }
        LocalDate anterior = tareas.get(0).getFechaInicio();
        for(Tarea tarea: tareas){
            if(tarea.getFechaInicio().isBefore(anterior)){
                anterior = tarea.getFechaInicio();
            }
        }
        return anterior;
    }

    @Override
    public LocalDate getFechaFin() {
        if(tareas.isEmpty()){
            return null;
        }
        LocalDate posterior = tareas.get(0).getFechaFin();
        for(Tarea tarea: tareas){
            if(tarea.getFechaFin().isAfter(posterior)){
                posterior = tarea.getFechaFin();
            }
        }
        return posterior;
    }

    @Override
    public Period getDuracion() {
        return diferencia;
    }

    @Override
    public ArrayList<Tarea> buscar(Condicion condicion) {
        ArrayList<Tarea> resultado = new ArrayList<>();
        for(Tarea tarea: tareas){
        resultado.addAll(tarea.buscar(condicion));
        }
        return resultado;
    }
}
