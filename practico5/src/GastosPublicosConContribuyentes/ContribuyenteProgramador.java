package GastosPublicosConContribuyentes;

public class ContribuyenteProgramador extends Contribuyente {
    private double montoFacturadoSoftware;

    public ContribuyenteProgramador(String nombre, String cod_identificacionTributaria, double montoFijo, double montoFacturadoSoftware) {
        super(nombre, cod_identificacionTributaria, montoFijo);
        this.montoFacturadoSoftware = montoFacturadoSoftware;
    }

    @Override
    public double calcularImpuesto() {
        return 0.2 * getMontoFijo() + 0.2 * montoFacturadoSoftware;
    }
}
