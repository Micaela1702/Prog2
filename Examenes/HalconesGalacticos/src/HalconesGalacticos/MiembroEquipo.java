package HalconesGalacticos;

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
}
