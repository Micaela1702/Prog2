package Series;
import java.util.ArrayList;

public class Serie {
    // atributos de la clase
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;


    // constructores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public Serie() {
        titulo = "The Walking Dead";
        descripcion = "The Walking Dead (TWD) is a TV series about sheriff's " +
                "deputy Rick Grimes who wakes up from a coma to a world overrun by zombies";
        creador = "Robert Kirkman";
        genero = "Apocalyptic Science Fiction";
        temporadas = new ArrayList<>(12);
    }

    public Serie(String titulo, String descripcion, String genero) {
        this(titulo, descripcion, "Robert Kirkman", genero, 11);

    }
    // funcionalidades


    public Serie(String titulo, String descripcion, String creador, String genero, int temporadas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    public int totalVistos() {
        int total = 0;
        for (int i = 0; i < temporadas.size(); i++) {
            total += temporadas.get(i).getTotalEpisodiosVistos(); // va guardando en total la cantidad de episodios vistos por
            // temporadas
        }
        return total;
    }

    public double promedioCalificacionSerie() {
        double suma = 0;
        double cantidad = 0;
        for (int i = 0; i < temporadas.size(); i++) {
            Temporada temp = temporadas.get(i); // dentro de la clase temporada guarda en la variable temp, la posición de la
                                                // temporada en el ArrayList.
            double promedioTemp = temp.getPromedioCalificaciones(); // en promedioTemp, guarda el promedio de las calificaciones
                                                                    // por episodio, por temporada.
            double cantCalificados = temp.getCantidadCalificados(); // en cantCalificados guarda la cantidad de episodios que fueron
                                                                    // calificados

            suma += promedioTemp * cantCalificados;                // para calcular correctamente el promedio de calificaciones en una serie
            cantidad += cantCalificados;
        }
        if (cantidad == 0){
            return 0;
        }
        return suma / cantidad;
    }

   public boolean seVieronTodos(){
         for(int i=0; i< temporadas.size();i++){
             if(!temporadas.get(i).seVieronTodos()){
                 return false;
            }
    }
       return true;
   }
}
