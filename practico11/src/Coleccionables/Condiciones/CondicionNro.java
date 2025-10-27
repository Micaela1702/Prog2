package Coleccionables.Condiciones;

import Coleccionables.Figurita;

public class CondicionNro extends Buscador{
    private int numero;

    public CondicionNro(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean cumple(Figurita figurita) {
        return figurita.getNumero() == numero;
    }
}
