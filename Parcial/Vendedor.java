package Parcial;

import Parcial.Condicion.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;


public class Vendedor extends Persona{
    private String nombre, apellido;
    private int edad;
    private ArrayList<Venta>ventas;
    
    public Vendedor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void agregar(Venta venta){
        ventas.add(venta);
    }


    @Override
    public int calculoGanancia() {
        int total=0;
        for (Venta venta : ventas) {
            total+=venta.ganancias();
        }
        return total;
    }

    @Override
    public ArrayList<Vendedor> buscar(Condicion condicion) {
        ArrayList<Vendedor>resultados=new ArrayList<>();

        if (condicion.cumple(this)) {
            resultados.add(this);
        }

        return resultados;
    }

    @Override
    public Persona copiar(Condicion condicion) {
        Vendedor vendedor=new Vendedor(getNombre(), getApellido(), getEdad());

        if (condicion.cumple(this)) {
            return vendedor;
        }
        else{
            return null;
        }
    }

    @Override
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Venta> ventas() {
        return ventas;
    }

    public int getVentas() {
        return ventas.size();
    }

    public int getCodigo(String codigo){
        for(Venta venta: ventas){
            if(venta.getCodigo().)
        }
    }

    public boolean getEnFecha (LocalDate fecha){
        for(Venta venta: ventas){
            if(venta.getFecha().equals(fecha)){
                return true;
            }
        }
        return false;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    


    
}
