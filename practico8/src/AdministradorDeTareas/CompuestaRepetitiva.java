package AdministradorDeTareas;

import java.util.ArrayList;

public class CompuestaRepetitiva extends TareaCompuesta {
    private int indicadorRepeticiones;


    public CompuestaRepetitiva(String especialidad, int indicadorRepeticiones) {
        super(especialidad);
        this.indicadorRepeticiones = indicadorRepeticiones;
    }


    @Override
    public double calcularCosto(){
        double costoBase = super.calcularCosto();
        return costoBase * indicadorRepeticiones;
    }

    @Override
    public double calcularTiempoEstimado(){
        double tiempoBase = super.calcularTiempoEstimado();
        return tiempoBase * indicadorRepeticiones;
    }

    @Override
    public ArrayList<String> obtenerAcciones(){
        ArrayList<String> acciones = new ArrayList<>(); // creo una nueva lista vacía, y agrego tantas veces las acciones a realizar como marque el indicador de repeticiones
        for(int i = 0; i < indicadorRepeticiones; i++){
            acciones.addAll(super.obtenerAcciones());
        }
        return acciones;
    }
}
