package CentroDeComputos;

public class ComputosPrincipal {
    public static void main(String[] args) {
        CentroDeComputo centro = new CentroDeComputo("TandilTech");

        centro.agregarProceso(new Proceso("Renderizado", 2048));
        centro.agregarProceso(new Proceso("Compilación", 1024));
        centro.agregarComputadora(new Computadora("PC-01", 3.5));
        centro.agregarComputadora(new Computadora("PC-02",2.8));
        centro.agregarProceso(new Proceso("Simulación", 4096));
    }
}