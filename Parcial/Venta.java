package Parcial;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private int codigo, dni, precio, cantidad;

    public Venta(LocalDate fecha, int codigo, int dni, int precio, int cantidad) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.dni = dni;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int ganancias(){
        return precio*cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
