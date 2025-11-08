package Wallpapers;


import Wallpapers.Condiciones.Condicion;

import java.util.ArrayList;

public abstract class Plataforma {

   public abstract int getCantidadPalabrasClave();
   public abstract int cantidadWallpapers();
   public abstract int cantidadDescargas();
   public abstract ArrayList<Wallpaper> buscar(Condicion condicion);

}
