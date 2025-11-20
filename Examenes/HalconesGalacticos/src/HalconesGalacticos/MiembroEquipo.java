package HalconesGalacticos;

import HalconesGalacticos.Condiciones.Condicion;

import java.util.ArrayList;

public class MiembroEquipo {
    private String nombreEnClave;
    private double altura;
    private String habilidadPrincipal;
    private ArrayList<String> metalesFavoritos;

    public MiembroEquipo(String nombreEnClave, double altura, String habilidadPrincipal) {
        this.nombreEnClave = nombreEnClave;
        this.altura = altura;
        this.habilidadPrincipal = habilidadPrincipal;
        this.metalesFavoritos = new ArrayList<>();
    }

    public void agregarMetales(String metal){
        metalesFavoritos.add(metal);
    }

    public ArrayList<String> getMetalesFavoritos(){
        return new ArrayList<>(metalesFavoritos);
    }

    public String getNombreEnClave() {
        return nombreEnClave;
    }

    public void setNombreEnClave(String nombreEnClave) {
        this.nombreEnClave = nombreEnClave;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getHabilidadPrincipal() {
        return habilidadPrincipal;
    }

    public void setHabilidadPrincipal(String habilidadPrincipal) {
        this.habilidadPrincipal = habilidadPrincipal;
    }

    public ArrayList<MiembroEquipo> buscar(Condicion condicion) {
        ArrayList<MiembroEquipo> resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }
}
