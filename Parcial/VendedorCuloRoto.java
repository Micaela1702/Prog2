package Parcial;

public class VendedorCuloRoto extends Vendedor{
    private int trampa;

    public VendedorCuloRoto(String nombre, String apellido, int edad, int trampa){
        super(nombre, apellido, edad);
        this.trampa=trampa;
    }

    @Override
    public int calculoGanancia(){
        return super.calculoGanancia()*trampa;
    }
}
