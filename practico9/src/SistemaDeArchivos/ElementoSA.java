package SistemaDeArchivos;

import SistemaDeArchivos.Condiciones.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA{
    private String nombre;
    private LocalDate fechaCreacion;

    public ElementoSA(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public abstract double calcularTamanio();

    public ArrayList<ElementoSA> buscar(Buscador condicion) {
        ArrayList<ElementoSA> resultado = new ArrayList<>();
        if (condicion.cumple(this)) { // si este elemento cumple
            resultado.add(this); // me agrego yo al resultado
        }
        return resultado;
    }
}
