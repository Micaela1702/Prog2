package Wallpapers.Condiciones;

import Wallpapers.Wallpaper;

public class CondicionPorCarga extends Condicion{
    private int descarga;

    public CondicionPorCarga(int carga){
        this.descarga = carga;
    }

    @Override
    public boolean cumple(Wallpaper wallpaper) {
        return wallpaper.getCantidadDescargas() > descarga;
    }
}
