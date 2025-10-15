package Agroquimicos;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<BuscadorPorCultivo> cultivosDesaconsejados;
    private ArrayList<String> estadosPatologicos;


    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivosDesaconsejados = new ArrayList<>();
        this.estadosPatologicos = new ArrayList<>();
    }

    public boolean trata(Enfermedad enfermedad) {
        return estadosPatologicos.containsAll(enfermedad.getEstadosPatologicos());
    }

    public boolean puedeAplicarseEn(Cultivo cultivo){
      return cultivosDesaconsejados.contains(cultivo.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
