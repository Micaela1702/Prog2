package Personajes;

public abstract class Fruta {
   private String nombre;


    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calculoFuerza(double peso);

}
