package Streaming;

public class BuscadorPorTitulo extends Buscador{
    private String palabraReq;

    public BuscadorPorTitulo(String palabraReq) {
        this.palabraReq = palabraReq;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getTitulo().contains(palabraReq);
    }
}
