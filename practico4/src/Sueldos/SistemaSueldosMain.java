package Sueldos;


public class SistemaSueldosMain {
    public static void main(String[] args) {
        Empleado e1 = new EmpleadoExtra("Javier", 20000, 2249853, 22.0, 2400);
        Empleado e2 = new EmpleadoPorComision("Juan", 25000, 20374652, 100000, 0.10);

        System.out.println(e1.getNombre() + " cobra: $" + e1.calcularSueldo());
        System.out.println(e2.getNombre() + " cobra: $" + e2.calcularSueldo());
    }
}


