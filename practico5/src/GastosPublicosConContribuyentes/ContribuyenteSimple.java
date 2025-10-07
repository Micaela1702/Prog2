package GastosPublicosConContribuyentes;

public class ContribuyenteSimple extends Contribuyente {


    public ContribuyenteSimple(String nombre, String cod_identificacionTributaria, double montoFijo) {
        super(nombre, cod_identificacionTributaria, montoFijo);
    }


    @Override
    public double calcularImpuesto(){
        return getMontoFijo();
    }
}
