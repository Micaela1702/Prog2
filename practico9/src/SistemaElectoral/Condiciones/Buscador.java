package SistemaElectoral.Condiciones;


import SistemaElectoral.Voto;

public abstract class Buscador {

    public abstract boolean cumple(Voto voto); // si el voto cumple la condicion
}
