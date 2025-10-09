package SistemaDeAlquileres;

import java.time.LocalDate;

public class AlquileresPrincipal {
    public static void main(String[] args) {
        VideoClub videoclub = new VideoClub("blockbuster");

        // Crear clientes
        Cliente cliente1 = new Cliente("Micaela", "2257835");
        Cliente cliente2 = new Cliente("Juan", "2257835");
        Cliente cliente3 = new Cliente("Octavio", "2257835");

        videoclub.registrarCliente(cliente1);
        videoclub.registrarCliente(cliente2);
        videoclub.registrarCliente(cliente3);

        // Crear películas
        Pelicula peli1 = new Pelicula("Matrix", LocalDate.of(02,03,26), cliente3);
        Pelicula peli2 = new Pelicula("Inception", LocalDate.of(02,03,26), cliente1);

        // Crear vehículos
        Vehiculo auto1 = new Vehiculo("Auto1", LocalDate.of(8,7, 27), cliente2, "Toyota","ABC123", "naftero");
        Vehiculo auto2 = new Vehiculo("Auto2", LocalDate.of(8,7, 27), cliente3, "Walkswagen", "TES456", "eléctrico");

        // Agregar ítems al videoclub
        videoclub.agregarItem(peli1);
        videoclub.agregarItem(peli2);
        videoclub.agregarItem(auto1);
        videoclub.agregarItem(auto2);

        // items alquilados
        
        // Mostrar clientes con alquileres vencidos
        System.out.println("Clientes con alquileres vencidos:");
        for (Cliente c : videoclub.clientes()) {
            System.out.println(" - " + c.getNombre());
        }
    }
}