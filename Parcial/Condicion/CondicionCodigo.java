package Parcial.Condicion;

import Parcial.Vendedor;

public class CondicionCodigo extends Condicion{
    private String codigo;

    public CondicionCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean cumple(Vendedor vendedor) {
        return vendedor.getCodigo();
    }
}
