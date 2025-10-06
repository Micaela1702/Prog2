package SombreroSeleccionador;

public class CasaLinaje extends Casa {




    public CasaLinaje(String nombre, int capacidadMaxima) {
        super(nombre, capacidadMaxima);
    }


    public boolean aceptaAlumno(Alumno aa) {
        if (super.aceptarAlumno(aa)) {
            for (Alumno alumno : alumnos) {
                if (aa.esFamiliar(alumno)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
