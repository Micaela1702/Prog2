package CentroDeComputos;

public class Proceso {
    private String nombre;
    private int reqMemoria;


    public Proceso(String nombre, int reqMemoria) {
        this.nombre = nombre;
        this.reqMemoria = reqMemoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getReqMemoria() {
        return reqMemoria;
    }

    public void setReqMemoria(int reqMemoria) {
        this.reqMemoria = reqMemoria;
    }
}
