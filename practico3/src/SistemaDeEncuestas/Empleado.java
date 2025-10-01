package SistemaDeEncuestas;

public class Empleado {
    private String nombre;
    private String DNI;
    private int encuestasRealizadas;
    private double sueldo;


    public Empleado(String nombre, int encuestasRealizadas) {
        this.nombre = nombre;
        this.encuestasRealizadas = encuestasRealizadas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEncuestasRealizadas(int encuestasRealizadas) {
        this.encuestasRealizadas = encuestasRealizadas;
    }

    public int getEncuestasRealizadas() {
        return encuestasRealizadas++;
    }

    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        Empleado e = (Empleado) o; // creo una instancia de empleado e, tratando al object como un empleado
        return this.DNI.equals(e.getDNI());
    }
}
