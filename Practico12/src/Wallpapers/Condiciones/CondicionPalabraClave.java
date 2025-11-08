package Wallpapers.Condiciones;

import Wallpapers.Wallpaper;

public class CondicionPalabraClave extends Condicion{
    private String palabraClave;

    public CondicionPalabraClave(String palabraClave){
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Wallpaper wallpaper) {
        return wallpaper.tienePalabraClave(palabraClave);
    }
}
