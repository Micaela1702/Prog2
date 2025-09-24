package Sueldos;

import java.util.ArrayList;

public class SistemaSueldo {
    private ArrayList<Empleado> empleados;
    private double monto;

    public SistemaSueldo(double monto) {
        this.empleados = new ArrayList<Empleado>();
        this.monto = monto;
    }

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
