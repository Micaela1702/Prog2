package SistemaDeArchivos;

import SistemaDeArchivos.Condiciones.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class AccesoDirecto extends ElementoSA{

    private double TAMANIOFIJO=1.00;
    private ElementoSA loQueApunta;

    public AccesoDirecto(String nombre, LocalDate fechaCreacion, ElementoSA loQueApunta) {
        super(nombre, fechaCreacion);
        this.loQueApunta = loQueApunta;
    }

    @Override
    public double calcularTamanio() {
        return TAMANIOFIJO;
    }

    @Override
    public ArrayList<ElementoSA> OrdenarYbuscar(Buscador condicion, Comparator<ElementoSA> comp) {
        return super.OrdenarYbuscar(condicion, comp);
    }
}
