package PilaDeElementos;

public class PilaPrincipal {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Pila original: " + pila);
        System.out.println("Top: " + pila.top());

        System.out.println("Pop: " + pila.pop());
        System.out.println("Después de pop: " + pila);

        Pila copia = (Pila) pila.copy();
        System.out.println("Copia: " + copia);

        Pila invertida = (Pila) pila.reverse();
        System.out.println("Invertida: " + invertida);
    }
}
