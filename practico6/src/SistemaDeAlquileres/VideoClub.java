package SistemaDeAlquileres;

import java.util.ArrayList;

public class VideoClub {

    private String nombre;
    private ArrayList<Item> items;
    private ArrayList<Cliente> clientes;


    public VideoClub(String nombre) {
        this.nombre = nombre;
        this.items = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarItem(Item i){
        items.add(i);
    }

    public void registrarCliente(Cliente c){
        clientes.add(c);
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public ArrayList<Cliente> clientes() {
        ArrayList<Cliente> clientesConAlquilerVencido = new ArrayList<>();
        for (Cliente c : clientes) {
            if (c.tieneAlquilerVencido()) {
                clientesConAlquilerVencido.add(c); // si está vencido lo agrega a la nueva lista, sino, devuelve la lista nueva, vacía
            }
        }
        return clientesConAlquilerVencido;
    }
}
