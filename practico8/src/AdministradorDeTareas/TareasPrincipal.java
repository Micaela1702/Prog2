package AdministradorDeTareas;

public class TareasPrincipal {
    public static void main(String[] args) {
        // Tareas simples
        TareaSimple cortar = new TareaSimple("Cortar metal", 50, 30);
        TareaSimple soldar = new TareaSimple("Soldar piezas", 70, 45);
        TareaSimple pintar = new TareaSimple("Pintar estructura", 40, 20);
        TareaSimple limpiar = new TareaSimple("Limpiar zona", 10, 5);

        // Tarea compuesta: ensamblar
        TareaCompuesta ensamblar = new TareaCompuesta("Metalmecánica");
        ensamblar.tareas.add(soldar);
        ensamblar.tareas.add(pintar);

        // Tarea compuesta repetitiva: mantenimiento
        CompuestaRepetitiva mantenimiento = new CompuestaRepetitiva("Metalmecánica", 2);
        mantenimiento.tareas.add(limpiar);
        mantenimiento.tareas.add(ensamblar);

        // Tarea compuesta metalmecánica: proyecto completo
        CompuestaMetalmecanica proyecto = new CompuestaMetalmecanica("Metalmecánica");
        proyecto.tareas.add(cortar);
        proyecto.tareas.add(mantenimiento);

        // Servicios requeridos
        System.out.println("🔧 Proyecto Metalmecánico");
        System.out.println("Costo total: $" + proyecto.calcularCosto());
        System.out.println("Tiempo estimado: " + proyecto.calcularTiempoEstimado() + " minutos");
        System.out.println("Cantidad de tareas simples: " + proyecto.contarTareasSimples());
        System.out.println("Acciones a realizar: " + proyecto.obtenerAcciones());
    }
}
