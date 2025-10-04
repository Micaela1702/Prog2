package Avicola;

import java.util.ArrayList;

public class AvicolaMain {
    public static void main(String[] args) {
        ArrayList<ProductoAvicola> productos = new ArrayList<>();

        // Producto fresco
        ProductoFresco fresco = new ProductoFresco(
                1001, "2025-11-01", "2025-09-20", "Granja Don Pepe"
        );

        // Producto refrigerado
        ProductoRefrigerado refrigerado = new ProductoRefrigerado(
                1002, "2025-12-15", "Granja Los Álamos", 123, 4.0, "2025-09-22"
        );

        // Producto congelado por aire
        CongeladoPorAire congeladoAire = new CongeladoPorAire(
                1003, "2026-03-10", "Granja Santa Rosa", 456, -20.0, "2025-09-25",
                78.0, 21.0, 0.03, 0.97
        );

        // Producto congelado por agua
        CongeladoPorAgua congeladoAgua = new CongeladoPorAgua(
                1004, "2026-04-01", "Granja La Esperanza", 789, -18.0, "2025-09-26",
                30.0, 0.5
        );

        // Producto congelado por nitrógeno
        CongeladoPorNitrogeno congeladoNitrogeno = new CongeladoPorNitrogeno(
                1005, "2026-05-20", "Granja Los Pinos", 999, -25.0, "2025-09-27",
                "Inmersión directa", 120
        );

        // Agregar a la lista
        productos.add(fresco);
        productos.add(refrigerado);
        productos.add(congeladoAire);
        productos.add(congeladoAgua);
        productos.add(congeladoNitrogeno);

        // Mostrar etiquetas
        System.out.println("=== ETIQUETAS DE PRODUCTOS ===");
        for (ProductoAvicola p : productos) {
            System.out.println(p.getEtiqueta());
        }
    }
}


