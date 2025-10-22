package JuegoDeGolosinas;

import JuegoDeGolosinas.Condiciones.Buscador;
import JuegoDeGolosinas.Condiciones.BuscadorPorDestruccion;

import java.util.ArrayList;

public class JuegoMain {

    public static void main(String[] args) {
        Tablero tablero = new Tablero(100);
        tablero.agregarFicha(new Ficha(1, 1, 0)); // chocolate
        tablero.agregarFicha(new Ficha(6, 1, 0)); // piedra
        tablero.agregarFicha(new Ficha(1, 1, 10)); // caramelo a rayas
        tablero.agregarFicha(new Ficha(8, 4, 4)); // torta
        tablero.agregarFicha(new FichaEspecial(9, 3, 0)); // ficha especial

        Buscador buscador = new BuscadorPorDestruccion(2);
        ArrayList<Ficha> poderosas = tablero.buscarFichas(buscador);
    }
}
