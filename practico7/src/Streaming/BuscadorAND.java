package Streaming;

public class BuscadorAND extends Buscador{
    private String actor;
    private String director;

    public BuscadorAND(String actor, String director) {
        this.actor = actor;
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return (pelicula.getActores().contains(actor) && !pelicula.getDirector().equals(director));
    }
}
