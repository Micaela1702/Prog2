package WorkBreakDownStructure;

import WorkBreakDownStructure.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaCompuesta extends Tarea{
    ArrayList<Tarea> tareas;

    @Override
    public LocalDate getFechaInicio() {
        return null;
    }

    @Override
    public LocalDate getFechaFin() {
        return null;
    }

    @Override
    public LocalDate getFechaFinEstimada() {
        return null;
    }

    @Override
    public String getEstadoTarea() {
        return "";
    }


    @Override
    public ArrayList<Tarea> buscar(Condicion condicion) {
        return null;
    }

    // calcular fecha de inicio y fecha fin
}
