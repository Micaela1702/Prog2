package Wallpapers;

import java.time.LocalDate;

public class WallpaperUniversal extends Wallpaper {
    private String palabra;

    public WallpaperUniversal(String nombre, Usuario usuario, int cantidadDescargas, LocalDate anioCreacion) {
        super(nombre, usuario, cantidadDescargas, anioCreacion);
    }

    @Override
    public boolean tienePalabraClave(String palabra){
        return true;
    }
}
