package SistemaDeArchivos;

import java.time.LocalDate;

public class ArchivoComprimido extends Directorio {
    private double tasaCompresion;

    public ArchivoComprimido(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
    }

    public double getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(double tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double calcularTamanio() {
        return super.calcularTamanio() * tasaCompresion;
    }

    @Override
    public int getCantElementos() {  // cuenta la cantidad de elementos de su archivo comprimido
        return super.getCantElementos();
    }
}
