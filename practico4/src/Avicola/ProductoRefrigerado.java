package Avicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoConFrio {

    public ProductoRefrigerado(int numeroLote, String fecha_vencimiento, String granjaOrigen, int codigoOrganismo, double tempMantenimiento, String fecha_envasado) {
        super(numeroLote, fecha_vencimiento, granjaOrigen, codigoOrganismo, tempMantenimiento, fecha_envasado);
    }


    @Override
    public String getEtiqueta() {
        return "Código de organismo: " + getCodigoOrganismo() +
                "Envasado: " + getFecha_envasado() +
                "Temperatura mantenimiento: " + getTempMantenimiento() +
                "Granja origen: " + getGranjaOrigen();
    }
}
