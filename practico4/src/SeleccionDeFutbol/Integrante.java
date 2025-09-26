package SeleccionDeFutbol;


import java.time.LocalDate;


public abstract class Integrante {
    private String nombre;
    private String apellido;
    private String pasaporte;
    private LocalDate fechaNacimiento;
    private String estado;
    private static final String EN_PAIS_ORIGEN = "en país de origen";
    private static final String VIAJANDO = "viajando";
    private static final String EN_CONCENTRACION = "en concentracion";


    public Integrante(String nombre, String apellido, String pasaporte, LocalDate fechaNacimiento, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean estaDisponibleParaEvento(){
        return this.estado.equals(EN_PAIS_ORIGEN) && !(enConcentracion());
    }

    public boolean enConcentracion(){
        return this.estado.equals(EN_CONCENTRACION);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean equals (Object o1){
        if(o1 == null){
            return false;
        }
        Integrante i = (Integrante) o1;
        return this.pasaporte.equals(i.getPasaporte());
    }
    @Override
    public String toString() { // consultar
        return nombre + " " + apellido + " - Estado: " + estado +
                " - Disponible: " + (estaDisponibleParaEvento() ? "Sí" : "No");
    }

    /* utilizar el ?, es equivalente a:
        String disponible;
        if (estaDisponibleParaEvento()) {
            disponible = "Sí";
        } else {
            disponible = "No";
        }
return nombre + " " + apellido + " - Estado: " + estado +
       " - Disponible: " + disponible;
    */
}

