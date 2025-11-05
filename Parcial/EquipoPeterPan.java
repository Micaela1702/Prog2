package Parcial;

public class EquipoPeterPan extends Equipo{

    public EquipoPeterPan(){

    }

    @Override
    public int getEdad(){
        int menor=0;
        for (Persona persona : lista) {
            if (persona.getEdad()>menor) {
                menor=persona.getEdad();
            }
        }
        return menor;
    }
}
