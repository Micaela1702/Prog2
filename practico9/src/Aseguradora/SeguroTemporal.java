package Aseguradora;

import java.time.LocalDate;

public class SeguroTemporal extends Cartera {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Cartera seguro;

    public SeguroTemporal(LocalDate fechaInicio, LocalDate fechaFin, Cartera seguro) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.seguro = seguro;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean estaVencido(){
        return !LocalDate.now().isAfter(fechaInicio) && LocalDate.now().isBefore(fechaFin);
    }

    @Override
    public double calcularCostoPoliza() {
        if (estaVencido()) {
            return 0;
        } else {
            return seguro.calcularCostoPoliza(); // devuelvo el costo del seguro que estoy calculando
        }
    }

    @Override
    public double getMontoAsegurado() {
        if (!estaVencido()) {
            return seguro.getMontoAsegurado();
        } else {
            return 0;
        }
    }

    @Override
    public int getNumeroPoliza() {
        return seguro.getNumeroPoliza();
    }
}
