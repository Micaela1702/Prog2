package AdministradorDeTareas;

import java.util.List;

public class TareaSimple extends Tarea {
    private String accionARealizar;
    private double costoEstimado;
    private double tiempoEstimado;

    public TareaSimple(String accionARealizar, double costoEstimado, double tiempoEstimado) {
        this.accionARealizar = accionARealizar;
        this.costoEstimado = costoEstimado;
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getAccionARealizar() {
        return accionARealizar;
    }

    public void setAccionARealizar(String accionARealizar) {
        this.accionARealizar = accionARealizar;
    }

    @Override
    public double calcularCosto() {
        return costoEstimado;
    }

    @Override
    public double calcularTiempoEstimado() {
        return tiempoEstimado;
    }

    @Override
    public List<String> obtenerAcciones() {
        return List.of(accionARealizar);
    }

    @Override
    public int contarTareasSimples() {
        return 1;
    }
}
