package Musify;

public class CondicionPorArtista extends Buscador{
    private String artista;

    public CondicionPorArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public boolean cumple(PistaDeMusica pistaDeMusica) {
        return pistaDeMusica.getArtista().equalsIgnoreCase(artista);
    }
}
