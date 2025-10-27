package Kiko.Condiciones;

import Kiko.ComandoSimple;

public class CondicionComando extends Buscador{
    private String comando;

    public CondicionComando(String comando) {
        this.comando = comando;
    }

    @Override
    public boolean cumple(ComandoSimple comandoSimple) {
        return comandoSimple.getInstruccion().contains(comando);
    }
}
