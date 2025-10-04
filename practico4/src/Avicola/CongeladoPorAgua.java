package Avicola;


public class CongeladoPorAgua extends ProductoCongelado {
    private double litroAgua;
    private double salinidad;

    public CongeladoPorAgua(int numeroLote, String fecha_vencimiento, String granjaOrigen,
                            int codigoOrganismo, double tempMantenimiento, String fecha_envasado, double salinidad, double litroAgua) {
        super(numeroLote, fecha_vencimiento, granjaOrigen, codigoOrganismo, tempMantenimiento, fecha_envasado);
        this.salinidad = salinidad;
        this.litroAgua = litroAgua;
    }

    public double getLitroAgua() {
        return litroAgua;
    }

    public void setLitroAgua(double litroAgua) {
        this.litroAgua = litroAgua;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }
    @Override
    public String getEtiqueta() {
        return "Congelado por Agua [Lote " + getNumeroLote() +
                ", Vence " + getFecha_vencimiento() +
                ", Envasado " + getFecha_envasado() +
                ", Granja " + getGranjaOrigen() +
                ", CodOrg " + getCodigoOrganismo() +
                ", Temp " + getTempMantenimiento() +
                "°C, Salinidad=" + salinidad + " g/L]";
    }
}
