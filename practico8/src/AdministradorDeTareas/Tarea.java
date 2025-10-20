package AdministradorDeTareas;

import java.util.List;

public abstract class Tarea {

    public abstract double calcularCosto();
    public abstract double calcularTiempoEstimado();
    public abstract List<String> obtenerAcciones();
    public abstract int contarTareasSimples();


}
