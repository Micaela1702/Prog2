package Vivero;

import java.util.ArrayList;

public class Planta {

    private String nombreCientifico;
    private ArrayList <String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private int sol;
    private int agua;

    public Planta(String nombreCientifico, ArrayList<String> nombresVulgares, String clasificacionSuperior, String familia, String clase, int sol, int agua) {
        this.nombreCientifico = nombreCientifico;
        this.nombresVulgares = nombresVulgares;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.sol = controlEscala(sol);
        this.agua = controlEscala(agua);
    }


    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public ArrayList<String> getNombresVulgares() {
        ArrayList<String> copiaNombreVulgares = new ArrayList<>();
        copiaNombreVulgares.addAll(nombresVulgares);
        return nombresVulgares;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int controlEscala(int numero){
        if(numero < 1){
            return 1;
        } else if(numero > 10){
            return 10;
        }
        return numero;
    }

    public void addNombreVulgar(String nombre){
        this.nombresVulgares.add(nombre);
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", nombresVulgares=" + nombresVulgares +
                ", clasificacionSuperior='" + clasificacionSuperior + '\'' +
                ", familia='" + familia + '\'' +
                ", clase='" + clase + '\'' +
                ", sol=" + sol +
                ", agua=" + agua +
                '}';
    }

}
