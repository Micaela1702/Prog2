package Wallpapers.Condiciones;

import Wallpapers.Usuario;
import Wallpapers.Wallpaper;

public class CondicionPorUsuario extends Condicion{
    Usuario usuario;

    @Override
    public boolean cumple(Wallpaper wallpaper) {
        return wallpaper.getUsuario().equals(usuario);
    }
}
