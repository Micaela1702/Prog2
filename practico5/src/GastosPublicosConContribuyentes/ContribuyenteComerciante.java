package GastosPublicosConContribuyentes;

public class ContribuyenteComerciante extends Contribuyente {
    private double montoFacturado;

    public ContribuyenteComerciante(String nombre, String cod_identificacionTributaria, double montoFijo, double montoFacturado) {
        super(nombre, cod_identificacionTributaria, montoFijo);
        this.montoFacturado = montoFacturado;
    }


    @Override
    public double calcularImpuesto() {
        return 0.5 * getMontoFijo() + 3.5 * montoFacturado;
    }
}
