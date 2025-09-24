package GastosPublicos;

public class Impuesto {
    private String nombre;
    private double monto;


public void Impuesto (String nombre, double monto){
    this.nombre = nombre;
    this.monto = monto;

}

public String getNombre(){
    return nombre;
}

public double getMonto(){
    return monto;
}

}
