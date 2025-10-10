package CentroDeComputos;

public class Computadora {
    private double velocidad;
    private double reqMemoria;

    public Computadora(double velocidad, double reqMemoria) {
        this.velocidad = velocidad;
        this.reqMemoria = reqMemoria;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getReqMemoria() {
        return reqMemoria;
    }

    public void setReqMemoria(double reqMemoria) {
        this.reqMemoria = reqMemoria;
    }
}
