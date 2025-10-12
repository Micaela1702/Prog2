package PuertoDeCereales;

import java.time.LocalDate;

public class PuertoPrincipal {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        // Crear camiones con distintas fechas de cargamento
        Camion c1 = new Camion("Camión A", "ABC123", LocalDate.of(2025, 10, 1));
        Camion c2 = new Camion("Camión B", "DEF456", LocalDate.of(2025, 10, 3));
        Camion c3 = new Camion("Camión C", "GHI789", LocalDate.of(2025, 9, 28));

        // Agregar camiones al puerto
        puerto.camiones.agregarCamion(c1);
        puerto.camiones.agregarCamion(c2);
        puerto.camiones.agregarCamion(c3);

        // Crear barcos con distintas capacidades
        Barco b1 = new Barco("Barco Alfa", "NAV001", 5000);
        Barco b2 = new Barco("Barco Beta", "NAV002", 8000);
        Barco b3 = new Barco("Barco Gamma", "NAV003", 3000);

        // Verificar cargamento y asignar camiones a barcos
        puerto.verificarCargamento(b1);
        puerto.verificarCargamento(b2);
        puerto.verificarCargamento(b3);

        // Descargar camiones en barcos
        puerto.asignarCamionABarco(b1);
        puerto.asignarCamionABarco(b2);
        puerto.asignarCamionABarco(b3);

        // Mostrar resultados
        System.out.println("Barco " + b1.getNombre() + (b1.estaVacio() ? " está vacío y esperando carga." : " ya tiene carga asignada."));
        System.out.println("Barco " + b2.getNombre() + (b2.estaVacio() ? " está vacío y esperando carga." : " ya tiene carga asignada."));
        System.out.println("Barco " + b3.getNombre() + (b3.estaVacio() ? " está vacío y esperando carga." : " ya tiene carga asignada."));
    }
}
