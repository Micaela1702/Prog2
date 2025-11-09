package Wallpapers.Condiciones;

import Wallpapers.Wallpaper;


public class CondicionPorAnio extends Condicion{
    private int anioSolicitado;

    public CondicionPorAnio(int anioSolicitado) {
        this.anioSolicitado = anioSolicitado;
    }

    @Override
    public boolean cumple(Wallpaper wallpaper) {
        return wallpaper.getAnioCreacion() == anioSolicitado;
    }
}
