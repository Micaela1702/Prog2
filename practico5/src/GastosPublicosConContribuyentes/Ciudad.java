package GastosPublicosConContribuyentes;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ArrayList<Contribuyente> contribuyentes;

    // constructores
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.contribuyentes = new ArrayList<>();

    }

    public void agregarContribuyente(Contribuyente c1){
        contribuyentes.add(c1);
    }


    public double getRecaudacionTotal() {
        double totalImpuestos = 0;
       for (Contribuyente c : contribuyentes){
           totalImpuestos += c.calcularImpuesto();
       }
       return totalImpuestos;
}

}
