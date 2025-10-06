package CooperativaAgricultores;

import java.util.ArrayList;

public class Lote {
    private String nombre;
    private double tamanio;
    private ArrayList<String> minerales;


    public Lote(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.minerales = new ArrayList<>();
    }
    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    // funcionalidades

    public boolean tieneMineral(String mm){
        return minerales.contains(mm);
    }

    public void agregarMineral(String mineralNuevo){ // controla repetidos
        String nuevo = mineralNuevo.toLowerCase();
        if (!this.minerales.contains(nuevo)) {
            minerales.add(nuevo);
        }
    }

    public boolean esApto(Cereal cereal){
        return cereal.esApto(this);
    }
}
