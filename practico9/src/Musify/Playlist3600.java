package Musify;


public class Playlist3600 extends Playlist{
    private double duracion;

    public Playlist3600(String nombre, double duracion) {
        super(nombre);
        this.duracion = duracion;
    }

    public void agregarElemento(Archivo archivo) {
        if (this.getDuracion() < duracion) { // obtengo la duración de yo como objeto (a eso hace referencia el this). Y si es menor, se agrega el elemento
            super.agregarElemento(archivo);
        }
    }
}
