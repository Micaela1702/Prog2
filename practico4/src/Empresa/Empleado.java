package Empresa;

public class Empleado extends Persona {
    protected int legajo;
    protected double sueldo;


    public Empleado (String nombre, String apellido, String cargo, int edad, int legajo, double sueldo){
        super(nombre, apellido, cargo, edad);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String toString(){
    return "Empleado - " + nombre + " " + apellido + " (" + edad + " años)"
                    + ", Legajo: " + legajo + ", Sueldo: $" + sueldo;
        }
}
