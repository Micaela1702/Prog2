package Sueldos;

public class EmpleadoExtra extends Empleado{

    private double valorHora;
    private double horasTrabajadas;



    public EmpleadoExtra(String nombre, double sueldo, int DNI, double horasTrabajadas, double valorHora) {
        super(nombre, sueldo, DNI);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }


    public double getHorasTrabajadas(){
        return horasTrabajadas;
    }

    @Override
    public double calcularSueldo(){
    return getSueldo() + (horasTrabajadas * valorHora);
    }
}
