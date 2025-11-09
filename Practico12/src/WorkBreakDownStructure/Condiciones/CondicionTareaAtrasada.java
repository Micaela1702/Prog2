package WorkBreakDownStructure.Condiciones;

import WorkBreakDownStructure.Tarea;

import java.time.LocalDate;

public class CondicionTareaAtrasada extends Condicion {


    @Override
    public boolean cumple(Tarea tarea) {
        return tarea.getFechaFinEstimada().isAfter(LocalDate.now());
    }
}
