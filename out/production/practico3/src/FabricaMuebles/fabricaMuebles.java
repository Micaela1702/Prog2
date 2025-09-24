package fabricaMuebles;

import java.util.ArrayList;

public class fabricaMuebles {
    private ArrayList<Producto> productos;


    public fabricaMuebles(){
        this.productos = new ArrayList<Producto>();
    }

    public boolean hayStockDeProductos(Producto p){
        return p.getCantProductos() > 0;
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public boolean hayStockProductos(Producto p){
        for (Producto pr: productos){
            if (pr.getCantProductos() > 0
            && pr.getTipo().equals(p.getTipo()) &&
            pr.getTipo_madera().equals(p.getTipo_madera()) && pr.getColor().equals(p.getColor())){
                return true;
            }
        }
        return false;
    }

    public double getCostoFabricacion(){
        double total = 0;
        for (Producto p: productos){
            total += p.getCosto_fabricacion() * p.getCantProductos();
        }
        return total;
    }

    public double getCostoPorVenta(){
        double total = 0;
        for (Producto p: productos){
            total += p.getValor_venta() * p.getCantProductos(); // multiplica porque quiero saber el costo de todos los productos que hay en stock
        }
        return total;
    }
}
