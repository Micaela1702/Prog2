package Wallpapers.Condiciones;

import Wallpapers.Wallpaper;

import java.time.LocalDate;

public class CondicionPorAnio extends Condicion{
    private LocalDate anioSolicitado;

    public CondicionPorAnio(LocalDate anioSolicitado) {
        this.anioSolicitado = anioSolicitado;
    }

    @Override
    public boolean cumple(Wallpaper wallpaper) {
        return wallpaper.getAnioCreacion().equals(anioSolicitado);
    }
}
