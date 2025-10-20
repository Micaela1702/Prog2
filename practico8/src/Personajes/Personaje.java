package Personajes;

public class Personaje extends Componente{

    private String nombre;
    private int edad;
    private double peso;
    private static double fuerzaPorDefecto= 125;
    private Fruta fruta;

    public Personaje(String nombre, int edad, double peso, Fruta fruta) {
        this.nombre= nombre;
        this.edad = edad;
        this.peso = peso;
        this.fruta = fruta;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double calcularEdad() {
        return edad;
    }

    @Override
    public double calcularFuerza() {
        if(fruta != null){
            return fruta.calculoFuerza(peso); // le delego el calculo de calcular la fuerza correspondiente a la fruta
        }
        return fuerzaPorDefecto; // devuelvo la fuerza por defecto, sin calculo
    }

    @Override
    public double calcularPeso() {
        return peso;
    }
}
