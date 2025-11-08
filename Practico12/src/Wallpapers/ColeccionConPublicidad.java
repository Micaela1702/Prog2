package Wallpapers;

import Wallpapers.Condiciones.Condicion;

import java.util.ArrayList;

public class ColeccionConPublicidad extends Coleccion{
    Wallpaper publicitado;

    public ColeccionConPublicidad(String titulo) {
        super(titulo);
    }


    @Override
    public ArrayList<Wallpaper> buscar(Condicion condicion){
        ArrayList<Wallpaper> resultado = super.buscar(condicion);
        resultado.add(0, publicitado); // en la posición 0 agrego el publicitado.
        return resultado;
    }
}
