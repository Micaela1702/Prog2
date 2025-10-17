package CompaniaDeEnvios;

import java.util.ArrayList;

public class ComboPostal extends Compania {
    private ArrayList<Compania> tiposDeEnvio;
    private double nroTracking;


    public ComboPostal(double nroTracking) {
        this.nroTracking = nroTracking;
        this.tiposDeEnvio = new ArrayList<>();
    }

    public void agregarEnvio(Compania envio){
        if(tiposDeEnvio.isEmpty()) {
            envio.modificarTracking(nroTracking);
            tiposDeEnvio.add(envio);
        } else if(envio.getDestinatario().equals(this.getDestinatario())){
            envio.modificarTracking(nroTracking);
            tiposDeEnvio.add(envio);
        }
    }


    @Override
    public double getPeso() { // calcula tanto el peso del combo postal que contiene, como del envío simple que contiene (total)
                              // y devuelve la suma de ambas clases en conjunto. 
        double pesoTotal=0;
        for(Compania te: tiposDeEnvio){
            pesoTotal += te.getPeso();
        }
        return pesoTotal;
    }

    @Override
    public String getDestinatario() {
        return tiposDeEnvio.get(0).getDestinatario(); // obtiene el primer elemento de la lista
    }

    @Override
    public String getRemitente() {
        return tiposDeEnvio.get(0).getRemitente(); // lo mismo que el de arriba
    }

    @Override
    public void modificarTracking(double nroTracking) {
        this.nroTracking = nroTracking; // modifico mi NRO de tracking, además de a todos sus elementos
        for(Compania te: tiposDeEnvio){
            te.modificarTracking(nroTracking);
        }
    }
}
