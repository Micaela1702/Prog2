package EstablecimientoDeportivo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Turno {
    private ArrayList<CanchaFutbol> futbol;
    private ArrayList<CanchaPadle> padle;
    private Usuario usuario;            // Tipo: Usuario → es la clase que definiste.
                                         // Atributo: usuario → es una variable de instancia que va a guardar
                                         // una referencia a un objeto de tipo Usuario.
    private LocalDateTime inicio;
    private LocalDateTime fin;
    double duracionHoras;


    public Turno (Usuario usuario, LocalDateTime inicio, LocalDateTime fin, double duracionHoras){
        this.futbol = new ArrayList<CanchaFutbol>();
        this.padle = new ArrayList<CanchaPadle>();
        this.usuario = usuario;
        this.inicio = inicio;
        this.duracionHoras = duracionHoras;
        this.fin = inicio.plusHours((long) duracionHoras);
    }

    public boolean seSuperponeCon(Turno otro){
        return this.inicio.isBefore(otro.getFin()) && otro.getInicio().isBefore(this.fin);
    }

    public LocalDateTime getInicio(){
        return inicio;
    }
    public LocalDateTime getFin(){
        return fin;
    }

}
