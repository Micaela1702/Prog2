package Avicola;


public abstract class ProductoConFrio extends ProductoFresco {
    private String fecha_envasado;
    private String granjaOrigen;
    private int codigoOrganismo;
    private double tempMantenimiento;


    public ProductoConFrio(int numeroLote, String fecha_vencimiento, String granjaOrigen, int codigoOrganismo, double tempMantenimiento, String fecha_envasado) {
        super(numeroLote, fecha_vencimiento, fecha_envasado, granjaOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.tempMantenimiento = tempMantenimiento;
        this.fecha_envasado = fecha_envasado;
    }

    public int getCodigoOrganismo(){
        return codigoOrganismo;
    }


    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public double getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(double tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }
}
