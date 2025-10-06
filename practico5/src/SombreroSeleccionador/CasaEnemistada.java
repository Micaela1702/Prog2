package SombreroSeleccionador;

public class CasaEnemistada extends Casa {

    Casa enemiga;

    public CasaEnemistada(String nombre, int capacidadMaxima) {
        super(nombre, capacidadMaxima);
    }

    public Casa getEnemiga(){
        return enemiga;
    }

    public boolean aceptaAlumno(Alumno aa) {
        return super.aceptarAlumno(aa) && !enemiga.aceptarAlumno(aa);
    }
}
