package CentroDeComputos;


import java.util.ArrayList;

public class CentroDeComputo {
    private String nombre;
    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> procesos;

    public CentroDeComputo(String nombre) {
        this.nombre = nombre;
        this.computadoras = new ArrayList<>();
        this.procesos = new ArrayList<>();
    }

    // Agrega computadora en orden descendente por velocidad
    public void agregarComputadora(Computadora c) {
        int i = 0;
        while (i < computadoras.size() && c.getVelocidad() < computadoras.get(i).getVelocidad()){
            i++;
        }
        computadoras.add(i, c);
    }

    public Computadora aEjecutar(){
        if(this.computadoras.isEmpty()){
            return null;
        } else {
            return this.computadoras.get(0);
        }
    }

}
