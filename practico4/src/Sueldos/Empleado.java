package Sueldos;

public abstract class Empleado {

  private String nombre;
  private double sueldo;
  private int DNI;

  public Empleado(String nombre, double sueldo, int DNI) {
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.DNI = DNI;
  }

  public abstract double calcularSueldo();

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  public int getDNI() {
    return DNI;
  }

  public void setDNI(int DNI) {
    this.DNI = DNI;
  }
}
