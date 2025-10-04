package PilaDeElementos;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Object> elementos;


    public Pila() {
        this.elementos = new ArrayList<>();
    }

    // Agrega elementos a la pila
    public void push(Object o) {
        elementos.add(o);
    }

    // Retirar el último elemento agregado

    public Object pop() {
        if (elementos.isEmpty()) { // si está vacío, retorna nulo porque no puede eliminar nada
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    public Object top(){
        if(elementos.isEmpty()){
            return null;
        }
        return elementos.get(elementos.size() -1); // devuelve -1 porque el indice máximo válido es la última posición, cómo en arreglos.
    }

    public int size(){
        return elementos.size();
    }

    public Object copy(){
        Pila nueva= new Pila();
        nueva.elementos.addAll(elementos); // agrega en nueva, todos los elementos de la pila
        return nueva;
    }

    public Object reverse() {
        Pila nueva = new Pila();
        for (int i = elementos.size() - 1; i >= 0; i--) { // recorre al revés y va agregando los elementos con el push, a la copia
            nueva.push(elementos);
        }
        return nueva;
    }

    @Override
    public String toString() {
        return elementos.toString();
    }

}
