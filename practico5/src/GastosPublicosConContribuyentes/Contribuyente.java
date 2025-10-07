package GastosPublicosConContribuyentes;

public abstract class Contribuyente {
    private String nombre;
    private String Cod_identificacionTributaria;
    private double montoFijo;


    public Contribuyente(String nombre, String cod_identificacionTributaria, double montoFijo) {
        this.nombre = nombre;
        Cod_identificacionTributaria = cod_identificacionTributaria;
        this.montoFijo = montoFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod_identificacionTributaria() {
        return Cod_identificacionTributaria;
    }

    public void setCod_identificacionTributaria(String cod_identificacionTributaria) {
        Cod_identificacionTributaria = cod_identificacionTributaria;
    }

    public double getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    public abstract double calcularImpuesto();

}
