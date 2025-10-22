package Musify;


public class Playlist3600 extends Playlist{
    private final static double duracion = 3600.00;


    public Playlist3600(String nombre) {
        super(nombre);
    }

    public void agregarElemento(Archivo archivo){
        double duracionArchivo = archivo.getDuracion();
        if(!(duracionArchivo > duracion)){
            super.agregarElemento(archivo);
        }
    }

}
