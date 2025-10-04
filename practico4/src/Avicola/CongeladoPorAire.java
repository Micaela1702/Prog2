package Avicola;

public class CongeladoPorAire extends ProductoCongelado {
    private double porcentajeN;
    private double porcentajeO2;
    private double porcentajeCO2;
    private double porcentajeH2O;

    public CongeladoPorAire(int numeroLote, String fecha_vencimiento, String granjaOrigen, int codigoOrganismo, double tempMantenimiento, String fecha_envasado, double porcentajeN,
                            double porcentajeO2, double porcentajeCO2, double porcentajeH2O) {
        super(numeroLote, fecha_vencimiento, granjaOrigen, codigoOrganismo, tempMantenimiento, fecha_envasado);
        this.porcentajeN = porcentajeN;
        this.porcentajeO2 = porcentajeO2;
        this.porcentajeCO2 = porcentajeCO2;
        this.porcentajeH2O = porcentajeH2O;
    }

    public double getPorcentajeN() {
        return porcentajeN;
    }

    public void setPorcentajeN(double porcentajeN) {
        this.porcentajeN = porcentajeN;
    }

    public double getPorcentajeO2() {
        return porcentajeO2;
    }

    public void setPorcentajeO2(double porcentajeO2) {
        this.porcentajeO2 = porcentajeO2;
    }

    public double getPorcentajeCO2() {
        return porcentajeCO2;
    }

    public void setPorcentajeCO2(double porcentajeCO2) {
        this.porcentajeCO2 = porcentajeCO2;
    }

    public double getPorcentajeH2O() {
        return porcentajeH2O;
    }

    public void setPorcentajeH2O(double porcentajeH2O) {
        this.porcentajeH2O = porcentajeH2O;
    }

    @Override
    public String getEtiqueta() {
        return "Congelado por Aire [Lote " + getNumeroLote() +
                ", Vence " + getFecha_vencimiento() +
                ", Envasado " + getFecha_envasado() +
                ", Granja " + getGranjaOrigen() +
                ", CodOrg " + getCodigoOrganismo() +
                ", Temp " + getTempMantenimiento() +
                "°C, Composición Aire: N=" + porcentajeN +
                "% O=" + porcentajeO2 + "% CO2=" + porcentajeCO2 +
                "% H2O=" + porcentajeH2O + "%]";
    }
}

