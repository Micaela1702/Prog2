package Avicola;

import java.time.LocalDate;

public class ProductoFresco extends ProductoAvicola {
    private String fecha_envasado;
    private String granjaOrigen;

    public ProductoFresco(int numeroLote, String fecha_vencimiento, String fecha_envasado, String granjaOrigen) {
        super(numeroLote, fecha_vencimiento);
        this.fecha_envasado = fecha_envasado;
        this.granjaOrigen = granjaOrigen;
    }

    public String getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(String fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String getEtiqueta() {
        return "Producto Fresco [Lote " + getNumeroLote() +
                ", Vence " + getFecha_vencimiento() +
                ", Envasado " + getFecha_envasado() +
                ", Granja " + granjaOrigen + "]";
    }

}
