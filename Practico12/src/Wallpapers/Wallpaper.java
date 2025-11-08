package Wallpapers;

import Wallpapers.Condiciones.Condicion;
import java.time.LocalDate;
import java.util.ArrayList;


public class Wallpaper extends Plataforma implements Comparable<Wallpaper> {
    private String nombre;
    private Usuario usuario;
    private int cantidadDescargas;
    private LocalDate anioCreacion;
    private ArrayList<String> palabrasClave;


    public Wallpaper(String nombre, Usuario usuario, int cantidadDescargas, LocalDate anioCreacion) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.cantidadDescargas = cantidadDescargas;
        this.anioCreacion = anioCreacion;
        this.palabrasClave = new ArrayList<>();

    }

    public int getCantidadPalabrasClave(){
        return palabrasClave.size();
    }

    @Override
    public int cantidadWallpapers() {
        return 1;
    }

    @Override
    public int cantidadDescargas() {
        return 1;
    }

    public boolean agregarPalabraClave(String palabra){
        return palabrasClave.add(palabra);
    }

    public boolean tienePalabraClave(String palabra) {
        return palabrasClave.contains(palabra);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCantidadDescargas() {
        return cantidadDescargas;
    }

    public void setCantidadDescargas(int cantidadDescargas) {
        this.cantidadDescargas = cantidadDescargas;
    }

    public LocalDate getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(LocalDate anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    @Override
    public ArrayList<Wallpaper> buscar(Condicion condicion) {
        ArrayList<Wallpaper> resultado = new ArrayList<>();
        if (condicion.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public int compareTo(Wallpaper wallpaper) {
        int resultado = wallpaper.getUsuario().getNombreDeUsuario().compareTo(this.getUsuario().getNombreDeUsuario());
        if (resultado == 0) {
            return wallpaper.getUsuario().getDireccionEmail().compareTo(this.getUsuario().getDireccionEmail());
        }
        return resultado;
    }
}
