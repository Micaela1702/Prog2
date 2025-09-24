package Series;

public class Main {
    public static void main(String[] args){

        Temporada t1 = new Temporada(10);
        Episodio e1 = new Episodio("piloto", "Rick se despierta del coma", true, 2);
        Episodio e2 = new Episodio();

        t1.agregarEpisodio(e1);
        t1.agregarEpisodio(e2);

        e1.marcarVisto();
        e2.marcarVisto();

        System.out.println("¿Se vieron todos? " + t1.seVieronTodos());
        System.out.println("¿Cuál fue el promedio de las calificaciones de una temporada? " + t1.getPromedioCalificaciones());

    }
}