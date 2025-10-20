package Personajes;

import java.util.ArrayList;

public class Tripulacion extends Componente {

    private String nombre;
    private ArrayList<Componente> componentes;

    public Tripulacion(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente componente){
        componentes.add(componente);
    }

    public int obtenerCantPersonajes() {
        int total = 0;
        for (Componente c : componentes) {
            if (c instanceof Personaje) {
                total++;
            } else if (c instanceof Tripulacion) { // vuelve a llamar al mismo método, para contar, si hay personajes dentro de una tripulación.
                total += ((Tripulacion) c).obtenerCantPersonajes();
            }
        }
        return total;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double calcularEdad() {
        double edadMaxima = 0;
        for (Componente c : componentes) {
            if(c.calcularEdad() > edadMaxima){
                edadMaxima = c.calcularEdad();
            }
        }
        return edadMaxima;
    }

    @Override
    public double calcularFuerza() {
        double sumaTotal = 0;
        for (Componente c : componentes) {
            sumaTotal += c.calcularFuerza();
        }
        return sumaTotal;
    }

    @Override
    public double calcularPeso() {
        if (!componentes.isEmpty()) {
            return componentes.get(0).calcularPeso();
        }
        return 0;
    }
}
