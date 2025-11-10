package Electronica;

import Electronica.Condiciones.Condicion;

import java.util.ArrayList;

public class Promocionadoras extends Categoria{
    private Producto promocionado;

    public Promocionadoras(String nombre, int maxPalabrasClave, Producto promocionado) {
        super(nombre, maxPalabrasClave);
        this.promocionado = promocionado;
    }

    @Override
    public ArrayList<ElementoP> buscar(Condicion condicion){
        ArrayList<ElementoP> resultado = super.buscar(condicion);
        resultado.add(0, promocionado);
        return resultado;
    }
}
