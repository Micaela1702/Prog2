package Vivero;

public class CondicionA extends Buscador {
    private String palabraIncluye;


    public CondicionA(String palabraIncluye){
        this.palabraIncluye = palabraIncluye;

    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getNombreCientifico().contains(palabraIncluye);
    }
}
