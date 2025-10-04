package Avicola;


public abstract class ProductoAvicola {
    protected int numeroLote;
    protected String fecha_vencimiento;


    public ProductoAvicola(int numeroLote, String fecha_vencimiento) {
        this.numeroLote = numeroLote;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public abstract String getEtiqueta();
}
