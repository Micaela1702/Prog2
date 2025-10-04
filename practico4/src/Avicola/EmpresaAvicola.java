package Avicola;

import java.util.ArrayList;

public class EmpresaAvicola {
    private ArrayList<ProductoAvicola> productosAvicola;


    public EmpresaAvicola(){
        this.productosAvicola = new ArrayList<ProductoAvicola>();
    }


    public void agregarProducto(ProductoAvicola a){
        productosAvicola.add(a);
    }
}
