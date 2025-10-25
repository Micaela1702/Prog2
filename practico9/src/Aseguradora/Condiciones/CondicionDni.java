package Aseguradora.Condiciones;

import Aseguradora.SeguroSimple;

public class CondicionDni extends Buscador{
    private String dni;

    public CondicionDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(SeguroSimple seguroSimple) {
        return seguroSimple.getDniTitular().equals(dni);
    }
}
