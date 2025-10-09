package SistemaDeAlquileres;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String DNI;
    private ArrayList<Item> items;


    public Cliente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.items = new ArrayList<>();
    }

    public boolean tieneAlquilerVencido(){
        for (Item item: items){ // recorre la lista de los items vencidos y consulta por cada uno si está vencido ese item en particular
            if(item.estaVencido()){
                return true;
            }
        }
        return false;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void agregarAlquiler(Item item) {
        items.add(item);
    }
}
