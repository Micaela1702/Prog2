package AgendaPersonal;

public class Persona {
    private String nombre;
    private String telefono;
    private String email;

    public Persona (String nombre, String telefono, String email){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona (){
        this("NN", "123456", "@gmail.com");
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getEmail(){
        return email;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString() {
        return nombre + " | Tel: " + telefono + " | Email: " + email;
    }
}
