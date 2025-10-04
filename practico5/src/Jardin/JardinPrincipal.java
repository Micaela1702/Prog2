package Jardin;

import java.time.LocalDate;

public class JardinPrincipal {
    public static void main(String[] args) {

        Planta p1 = new Planta("Rosa rubiginosa", "Rosa mosqueta", "Chile", LocalDate.of(2023, 5, 20), 6);
        Planta p2 = new Planta("Lavandula angustifolia", "Lavanda", "Francia", LocalDate.of(2024, 3, 15), 4);

        System.out.println(p1);
        System.out.println(p2);
    }
}