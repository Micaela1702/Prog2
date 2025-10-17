package CompaniaDeEnvios;

public abstract class Compania {

    public abstract double getPeso();
    public abstract String getDestinatario();
    public abstract String getRemitente();
    public abstract void modificarTracking(double nroTracking);

}
