package SistemaDeArchivos;

public class CondicionPorPalabra extends Buscador{
    private final static String palabra = "Parcial";


    @Override
    public boolean cumple(ElementoSA elementoSA) {
        return elementoSA.getNombre().contains(palabra);
    }
}
