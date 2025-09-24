package Sueldos;

public class EmpleadoPorComision extends Empleado {

    public int cantVentasRealizadas;
    public double porcentaje;

    public EmpleadoPorComision(String nombre, double sueldo, int DNI, int cantVentasRealizadas, double porcentaje) {
        super(nombre, sueldo, DNI);
        this.cantVentasRealizadas = cantVentasRealizadas;
        this.porcentaje = porcentaje;
    }

    public int getCantVentasRealizadas() {
        return cantVentasRealizadas;
    }

    public void setCantVentasRealizadas(int cantVentasRealizadas) {
        this.cantVentasRealizadas = cantVentasRealizadas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override // sobreescribe el método del padre
    public double calcularSueldo(){
        return getSueldo() + (cantVentasRealizadas * porcentaje);

    }

}
