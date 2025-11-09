package WorkBreakDownStructure.Condiciones;

import WorkBreakDownStructure.Tarea;

public class CondicionEstado extends Condicion{
    private String estado;

    public CondicionEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean cumple(Tarea tarea) {
        return tarea.getEstadoTarea().equals(estado);
    }
}
