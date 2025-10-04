package Avicola;


public class CongeladoPorNitrogeno extends ProductoCongelado{
    private String metodoCongelacion;
    private double tiempoCongelacion;

    public CongeladoPorNitrogeno(int numeroLote, String fecha_vencimiento, String granjaOrigen, int codigoOrganismo, double tempMantenimiento, String fecha_envasado, String metodoCongelacion, double tiempoCongelacion) {
        super(numeroLote, fecha_vencimiento, granjaOrigen, codigoOrganismo, tempMantenimiento, fecha_envasado);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoCongelacion = tiempoCongelacion;
    }

    @Override
    public String getEtiqueta() {
        return "Congelado por Nitrógeno [Lote " + getNumeroLote() +
                ", Vence " + getFecha_vencimiento() +
                ", Envasado " + getFecha_envasado() +
                ", Granja " + getGranjaOrigen() +
                ", CodOrg " + getCodigoOrganismo() +
                ", Temp " + getTempMantenimiento() +
                "°C, Método=" + metodoCongelacion +
                ", Tiempo Exposición=" + tiempoCongelacion + " seg]";
    }
}

