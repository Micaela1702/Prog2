package Aseguradora.Condiciones;

import Aseguradora.SeguroSimple;

public class CondicionDni extends Buscador{
    private int dni;

    public CondicionDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(SeguroSimple seguroSimple) {
        return seguroSimple.getDniTitular() == dni;
    }
}
