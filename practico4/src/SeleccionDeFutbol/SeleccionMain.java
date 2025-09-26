package SeleccionDeFutbol;

import java.time.LocalDate;

public class SeleccionMain {
    public static void main(String[] args) {
        Contingente seleccion = new Contingente();

        Futbolista f1 = new Futbolista("Lionel", "Messi", "ABC123",
                LocalDate.of(1987,6,24), true, "Delantero", 800, "en país de origen");

        Futbolista f2 = new Futbolista("Julian", "Alvarez", "DEF456",
                LocalDate.of(2000,1,31), false, "Delantero", 50, "viajando");

        Futbolista f3 = new Futbolista("Copia", "Jugador", "ABC123",
                LocalDate.of(1990,5,20), true, "Defensor", 0, "en país de origen"); // mismo pasaporte

        Entrenador e1 = new Entrenador("Lionel", "Scaloni", "ENT001",
                LocalDate.of(1978,5,16), 1001, "viajando");

        Masajista m1 = new Masajista("Pedro", "Gomez", "MAS001",
                LocalDate.of(1975,3,10), "Fisioterapeuta", 15, "en concentracion");

        seleccion.agregarIntegrante(f1);
        seleccion.agregarIntegrante(f2);
        seleccion.agregarIntegrante(f3); // no debería agregarse
        seleccion.agregarIntegrante(e1);
        seleccion.agregarIntegrante(m1);

        System.out.println("Integrantes en la selección:");
        for (Integrante i : seleccion.getIntegrantes()) {
            System.out.println(i.getNombre() + " " + i.getApellido() + " - Pasaporte: " + i.getPasaporte());
        }

        System.out.println("Disponibilidad:");
        System.out.println(f1.getNombre() + ": " + f1.toString());
        System.out.println(e1.getNombre() + ": " + e1.toString());
        System.out.println(m1.getNombre() + ": " + m1.toString());
    }
}
