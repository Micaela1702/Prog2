package Series;
import java.util.ArrayList;

public class Temporada {
    private int cantidadEpisodios;
    private ArrayList<Episodio> episodios;

    public Temporada(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
        this.episodios = new ArrayList<>();

    }

    public int getTotalEpisodiosVistos() {
        int totalVistos = 0;
        for (int i = 0; i < episodios.size(); i++) { // for (Episodio episodio : episodios) {
            if (episodios.get(i).seVioEpisodio()) {
                totalVistos++;
            }
        }
        return totalVistos;
    }

    public double getPromedioCalificaciones() {
        double suma = 0;
        int cantidad = 0;
        for (int i = 0; i < episodios.size(); i++) { // recorro el arreglo de episodios
            int calif = episodios.get(i).getCalificacion(); //obtengo la calificacion de cada episodio
            if (calif >= 0) {
                suma += calif; // la suma almacena la cantidad de episodios que fueron calificados
                cantidad++; // incremento la cantidad total de episodios que fueron calificados
            }
        }
        return (double) (int) suma / cantidad;
    }

    public int getCantidadCalificados() {
        int calificadosTotal = 0;
        for (int i = 0; i < episodios.size(); i++) {
            int calif = episodios.get(i).getCalificacion();
            if (calif >= 0) {
                calificadosTotal++;
            }
        }
        return calificadosTotal;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }

    public boolean seVieronTodos(){
        return episodios.size() == getTotalEpisodiosVistos();
      }

    public void agregarEpisodio(Episodio e) {
        episodios.add(e);
    }
 }
