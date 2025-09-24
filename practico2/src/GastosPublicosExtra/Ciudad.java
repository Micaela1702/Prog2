package GastosPublicosExtra;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private String provincia;
    private static final double COSTO_POR_HABITANTE = 100.00;
    private ArrayList<Impuesto> impuestos;
    private double habitantes;

    // constructores
    public Ciudad(String nombre, String provincia, double habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.impuestos = new ArrayList<>(5);

    }

    public Ciudad() {
        this("Tandil", "Buenos Aires", 0.0);
    }


    public ArrayList<Impuesto> getImpuestos() {
        return impuestos;
    }

    public double gastoMantenimiento (){
        return habitantes * COSTO_POR_HABITANTE;
    }

    public void agregarImpuesto(Impuesto imp){
        if (impuestos.size() < 5){ // si el tamaño es menor a 5 entonces agrego el impuesto, porque mi limite es 5.
            impuestos.add(imp);
        } else {
            System.out.println("no se puede agregar porque supera la capacidad de impuestos.");
        }
    }

    public double getRecaudacionTotal() {
        double suma = 0;
       for (Impuesto i : impuestos){
           suma += i.getMonto();
       }
       return suma;
}

    public boolean tieneDeficit(){
        return gastoMantenimiento() > getRecaudacionTotal();
    }

    @Override
    public String toString() {
        return nombre + " (" + provincia + ") - Habitantes: " + habitantes;
    }

}
