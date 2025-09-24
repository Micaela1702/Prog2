package Series;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    // constructor

    public Episodio(String titulo, String descripcion, boolean visto, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.calificacion = calificacion;
    }

    public Episodio(){
        this("sin Nombre","sin descripcion", false, -1);
    }

    // funcionalidades

    public void marcarVisto() {
        this.visto = true;
    }

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

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public boolean seVioEpisodio(){
        return visto;
    }

    public boolean calificarEpisodio(int calificacion){
        if (!visto){ // si no se vio no se puede calificar.
            return false;
        } if(calificacion < 0 || calificacion > 5) {
            return false; //calificacion fuera de rango.
        }
        this.calificacion = calificacion;
        return true;
    }

    public int getCalificacion(){
        return this.calificacion;
    }
}
