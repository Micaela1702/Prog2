package CompaniaDeEnvios;

public class EnvioSimple extends Compania{
    private String destinatario;
    private String remitente;
    private double peso;
    private boolean retiroEnSucursal;
    private double nroTracking;

    public EnvioSimple(String destinatario, String remitente, double peso, boolean retiroEnSucursal, double nroTracking) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.peso = peso;
        this.retiroEnSucursal = retiroEnSucursal;
        this.nroTracking = nroTracking;
    }

    public double getNroTracking() {
        return nroTracking;
    }

    public void setNroTracking(double nroTracking) {
        this.nroTracking = nroTracking;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isRetiroEnSucursal() {
        return retiroEnSucursal;
    }

    public void setRetiroEnSucursal(boolean retiroEnSucursal) {
        this.retiroEnSucursal = retiroEnSucursal;
    }

    @Override
    public void modificarTracking(double nroTracking) {
        setNroTracking(nroTracking);
        // o
        // this.nroTracking = nroTraking (pasado como parámetro)
    }
}
