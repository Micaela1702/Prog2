package Parcial.Condicion;

import Parcial.Vendedor;

import java.time.LocalDate;

public class VentaRealizada extends Condicion{
    private LocalDate fechaVenta;


    public VentaRealizada(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public boolean cumple(Vendedor vendedor) {
        return vendedor.getEnFecha().isBefore(fechaVenta);
    }
}
