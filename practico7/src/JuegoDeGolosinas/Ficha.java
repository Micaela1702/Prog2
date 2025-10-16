package JuegoDeGolosinas;

public class Ficha { // para heredar, tiene que pertenecer al TIPO ojo!!
    private double fortaleza;
    private double espacio;
    private double poderDestruccion;

    public Ficha(double fortaleza, double espacio, double poderDestruccion) {
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poderDestruccion = poderDestruccion;
    }


    public double getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(double fortaleza) {
        this.fortaleza = fortaleza;
    }

    public double getEspacio() {
        return espacio;
    }

    public void setEspacio(double espacio) {
        this.espacio = espacio;
    }

    public double getPoderDestruccion() {
        return poderDestruccion;
    }

}
