package FabricaMuebles;

public class Producto {
    private String tipo;
    private int cantProductos;
    private double peso;
    private double costo_fabricacion;
    private double valor_venta;
    private String tipo_madera;
    private String color;
    private double adicional = 0.35;



    public Producto(String tipo, double peso, double costo_fabricacion, String tipo_madera, String color, int cantProductos){
        this.tipo = tipo;
        this.peso = peso;
        this.costo_fabricacion = costo_fabricacion;
        this.valor_venta = calcularPrecioVenta();
        this.tipo_madera = tipo_madera;
        this.color = color;
        this.cantProductos = cantProductos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantProductos(){
        return cantProductos;
    }

    public double getCosto_fabricacion(){
        return costo_fabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCosto_fabricacion(double costo_fabricacion) {
        this.costo_fabricacion = costo_fabricacion;
        this.valor_venta = calcularPrecioVenta(); // recalcula cuando cambia costo
    }

    public double getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public String getTipo_madera() {
        return tipo_madera;
    }

    public void setTipo_madera(String tipo_madera) {
        this.tipo_madera = tipo_madera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularPrecioVenta(){
        return costo_fabricacion * (1 + adicional);
    }
}
