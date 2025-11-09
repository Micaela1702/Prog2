package WorkBreakDownStructure;

import WorkBreakDownStructure.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Tarea {

    public abstract LocalDate getFechaInicio();
    public abstract LocalDate getFechaFin();
    public abstract LocalDate getFechaFinEstimada();
    public abstract String getEstadoTarea();
    public abstract double getDuracion();
    public abstract ArrayList<Tarea> buscar(Condicion condicion);


}
