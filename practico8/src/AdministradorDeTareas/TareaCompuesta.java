package AdministradorDeTareas;
import java.util.ArrayList;


public class TareaCompuesta extends Tarea {
    private String especialidad;
    protected ArrayList<Tarea> tareas;
    protected static final int TIEMPO_EXTRA_POR_SIMPLE= 10;

    public TareaCompuesta(String especialidad) {
        this.especialidad = especialidad;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea){
        if(!tareas.isEmpty()){
            tareas.add(tarea);
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public double calcularCosto() {
        double sumaTotal=0;
        for(Tarea tarea: tareas){
            sumaTotal += tarea.calcularCosto();
        }
        return sumaTotal;
    }

    @Override
    public double calcularTiempoEstimado() {
        double tiempoTotal=0;
        for(Tarea tarea: tareas) {
            tiempoTotal += tarea.calcularTiempoEstimado();
        }
        tiempoTotal += contarTareasSimples() * TIEMPO_EXTRA_POR_SIMPLE;
        return tiempoTotal;
    }

    @Override
    public ArrayList<String> obtenerAcciones() {
        ArrayList<String> resultado = new ArrayList<>();
        for(Tarea tarea: tareas){
            resultado.addAll(tarea.obtenerAcciones()); // el addAll puede agregar colecciones a la lista vacía
        }
        return resultado;
    }

    public int contarTareasSimples(){
        int cantidadTareas=0;
        for(Tarea tarea: tareas){
            cantidadTareas += tarea.contarTareasSimples();
        }
        return cantidadTareas;
    }
}
