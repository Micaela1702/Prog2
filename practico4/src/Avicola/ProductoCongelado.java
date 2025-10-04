package Avicola;

import java.time.LocalDate;

public class ProductoCongelado extends ProductoConFrio {

    public ProductoCongelado(int numeroLote, String fecha_vencimiento, String granjaOrigen, int codigoOrganismo, double tempMantenimiento, String fecha_envasado) {
        super(numeroLote, fecha_vencimiento, granjaOrigen, codigoOrganismo, tempMantenimiento, fecha_envasado);
    }

    @Override
    public String getEtiqueta() {
        return "Producto congelado [Lote: " + getNumeroLote() +
                "Vence: " + getFecha_vencimiento() +
                "Envasado: " + getFecha_envasado() +
                "Código de organismo: " + getCodigoOrganismo() +
                "Granja origen: " + getGranjaOrigen() +
                "Temperatura mantenimiento: " + getTempMantenimiento();
    }
}
