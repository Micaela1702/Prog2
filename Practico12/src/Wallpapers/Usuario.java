package Wallpapers;

import java.time.LocalDate;

public class Usuario {
    private String nombreDeUsuario;
    private LocalDate anioRegistro;
    private String direccionEmail;

    public Usuario(String nombreDeUsuario, LocalDate anioRegistro, String direccionEmail) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.anioRegistro = anioRegistro;
        this.direccionEmail = direccionEmail;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public LocalDate getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(LocalDate anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public String getDireccionEmail() {
        return direccionEmail;
    }

    public void setDireccionEmail(String direccionEmail) {
        this.direccionEmail = direccionEmail;
    }
}
