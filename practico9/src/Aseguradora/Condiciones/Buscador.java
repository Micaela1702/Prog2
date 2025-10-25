package Aseguradora.Condiciones;

import Aseguradora.Cartera;
import Aseguradora.SeguroSimple;

public abstract class Buscador {

    public abstract boolean cumple(SeguroSimple seguroSimple);
}
