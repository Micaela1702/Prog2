package HalconesGalacticos;


import java.util.ArrayList;

public class EquipoEspecial extends EquipoTactico{


    @Override
    public double getTalle() {
        return elementos.get(0).getTalle();
    }

    @Override
    public ArrayList<String> getMetales() {
        return super.getMetales();
    }

}
