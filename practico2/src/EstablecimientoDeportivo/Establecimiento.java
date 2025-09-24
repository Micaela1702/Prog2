package EstablecimientoDeportivo;

import java.util.ArrayList;

public class Establecimiento {

    private ArrayList<Turno> turnos;
    private ArrayList<CanchaFutbol> futbol;
    private ArrayList<CanchaPadle> padle;
    private ArrayList<Usuario> usuarios;
    private int descuentoAplicado;


    public Establecimiento() {
        this.turnos = new ArrayList<Turno>();
        this.futbol = new ArrayList<CanchaFutbol>();
        this.padle = new ArrayList<CanchaPadle>();
        this.usuarios = new ArrayList<Usuario>();

    }

    public boolean estaOcupada(Turno tt){
        for (Turno existente : turnos){
            if (existente.seSuperponeCon(tt)){
                return true;
            }
        }
        return false;
    }

    public void agregarUsuario(Usuario u){
        usuarios.add(u);
    }

    public ArrayList<Usuario> getUsuarios (){
        return usuarios;
    }

    public void agregarTurno(Turno t){
        if (estaOcupada(t)){
            System.out.println("no se puede agregar el turno");
        } else {
            turnos.add(t);
        }
    }

    public void agregarCancha(CanchaPadle p){
        if(padle.size() < 4){
            padle.add(p);
        } else {
            System.out.println("no se pudo agregar la cancha ");
        }
    }

    public void agregarCancha(CanchaFutbol c){
        if(futbol.size() < 2){
            futbol.add(c);
        } else {
            System.out.println("no se pudo agregar la cancha ");
        }
    }

    public ArrayList<CanchaFutbol> getFutbol(){
        return futbol;
    }
    public ArrayList<CanchaPadle> getPadle(){
        return padle;
    }

    public void esSocioEstablecimiento(CanchaFutbol f){
        for (Usuario u : usuarios){
            if(u.esSocio()){
                aplicarDescuento(f);
            }
        }
    }

    public double aplicarDescuento(CanchaFutbol f){ // revisar
        return f.getCostoPorHora() - descuentoAplicado;
    }
}