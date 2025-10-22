package Musify;


public class Playlist3600 extends Playlist{
    private double duracion;

    public Playlist3600(String nombre, double duracion) {
        super(nombre);
        this.duracion = duracion;
    }

    public void agregarElemento(Archivo archivo) {
        if (this.getDuracion() < duracion) { // hago referencia a la duración de esta playlist en particular
            super.agregarElemento(archivo);
        }
    }
}
