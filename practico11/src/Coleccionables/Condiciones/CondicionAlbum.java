package Coleccionables.Condiciones;

import Coleccionables.Figurita;

public class CondicionAlbum extends Buscador{
    private String album;

    public CondicionAlbum(String album) {
        this.album = album;
    }

    @Override
    public boolean cumple(Figurita figurita) {
        return figurita.getAlbum().contains(album);
    }
}
