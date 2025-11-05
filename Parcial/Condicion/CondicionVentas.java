package Parcial.Condicion;

import Parcial.Vendedor;

public class CondicionVentas extends Condicion{
    private int ventaProducto;

    public CondicionVentas(int ventaProducto) {
        this.ventaProducto = ventaProducto;
    }


    @Override
    public boolean cumple(Vendedor vendedor) {
        return vendedor.getVentas() < ventaProducto;
    }
}
