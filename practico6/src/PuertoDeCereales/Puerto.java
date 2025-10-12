package PuertoDeCereales;

public class Puerto {
    private ColaPrioridad barcos;
    ColaPrioridad camiones;


    public Puerto() {
        this.barcos = new ColaPrioridad();
        this.camiones = new ColaPrioridad();
    }

    public void verificarCargamento(Barco barco) {
        if (barco.estaVacio()) {
            barcos.agregar(barco); // Agrega el barco a la cola de prioridad del puerto
            Camion camion = camiones.obtenerCamionPrioritario(); // Asume que dameSiguiente() devuelve el próximo camión
            barco.asignoCarga(camion); // Asigna el camión al barco
        }
    }

    public void asignarCamionABarco(Barco barco){
        Camion camion = camiones.obtenerCamionPrioritario(); // Primero obtengo el camión de la cola de espera de camiones
        if(barco.estaVacio() && camion != null && !camion.estaVacio()){
            camiones.agregarCamion(camion);
            barco.asignoCarga(camion);
            camiones.descargar(camion);
        }
    }
}

