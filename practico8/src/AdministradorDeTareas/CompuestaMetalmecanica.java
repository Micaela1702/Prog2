package AdministradorDeTareas;

import java.util.ArrayList;

public class CompuestaMetalmecanica extends TareaCompuesta {
    private final static int EXTRA_TIEMPO_POR_SIMPLE = 15;

    public CompuestaMetalmecanica(String especialidad) {
        super(especialidad);
    }


    @Override
    public double calcularCosto(){
        return super.calcularCosto();
    }

    public double calcularTiempoEstimado(){
        double tiempoBase = super.calcularTiempoEstimado();
        int cantidadSimples = super.contarTareasSimples();
        return tiempoBase - (cantidadSimples * TIEMPO_EXTRA_POR_SIMPLE) + (cantidadSimples * EXTRA_TIEMPO_POR_SIMPLE);
        // le resto 10, porque dentro del calculo de calcular el tiempo, en tarea compuesta (del cuál hereda), se lo multiplicaba por 10,
        // ya que era lo que la consigna me pedía. Acá ya no me sirve ese valor
    }

    public ArrayList<String> obtenerAcciones(){
        return super.obtenerAcciones();
    }
}
