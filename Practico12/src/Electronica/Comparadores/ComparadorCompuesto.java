package Electronica.Comparadores;
import Electronica.Producto;
import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Producto>{
    private Comparator<Producto> comp1, comp2;

    public ComparadorCompuesto(Comparator<Producto> comp1, Comparator<Producto> comp2){
        this.comp1 = comp1;
        this.comp2 = comp2;

    }

    @Override
    public int compare(Producto producto1, Producto producto2) {
        int resultado = comp1.compare(producto1, producto2);
        if(resultado == 0){
            return comp2.compare(producto1, producto2);
        }
        return resultado;
    }
}
