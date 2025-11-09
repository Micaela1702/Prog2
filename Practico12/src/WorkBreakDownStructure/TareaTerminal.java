package WorkBreakDownStructure;

import WorkBreakDownStructure.Condiciones.Condicion;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class TareaTerminal extends Tarea{
    private LocalDate fechaInicio;
    private LocalDate fechaFinEstimada;
    private LocalDate fechaFinReal;
    private String estadoTarea;
    private Period diferencia =  Period.between(getFechaInicio(), getFechaFinEstimada());


    public TareaTerminal(LocalDate fechaInicio, LocalDate fechaFinEstimada, LocalDate fechaFinReal, String estadoTarea) {
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
        this.fechaFinReal = fechaFinReal;
        this.estadoTarea = estadoTarea;
    }

    public LocalDate getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(LocalDate fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    public void setFechaFinReal(LocalDate fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }

    public String getEstadoTarea() {
        return estadoTarea;
    }

    @Override
    public Period getDuracion() {
        return diferencia;
    }

    public void setEstadoTarea(String estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    @Override
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public LocalDate getFechaFin() {
        return fechaFinReal;
    }

    @Override
    public ArrayList<Tarea> buscar(Condicion condicion) {
        ArrayList<Tarea> resultado = new ArrayList<>();
        if (condicion.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }
}
