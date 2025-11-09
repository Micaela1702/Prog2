package WorkBreakDownStructure.Condiciones;

import WorkBreakDownStructure.Tarea;

public class CondicionAND extends Condicion {
    Condicion cond1, cond2;

    public CondicionAND(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }


    @Override
    public boolean cumple(Tarea tarea) {
        return cond1.cumple(tarea) && cond2.cumple(tarea);
    }
}
