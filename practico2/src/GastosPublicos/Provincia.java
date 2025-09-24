package GastosPublicos;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia (String nombre){
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad c){
        ciudades.add(c);
    }
    public ArrayList<Ciudad> getCiudad() {
        return ciudades;
    }

    public int getCiudadesConDeficit(){ // cuenta la cantidad de ciudades que tiene deficit.
       int contador = 0;
       for (Ciudad c: ciudades){
           if (c.tieneDeficit()){
            contador++;
           }
       }
       return contador;
    }

    public boolean enCondicionDeDeficit(){
        int conDeficit = getCiudadesConDeficit();
        return conDeficit > (ciudades.size()/2); // calcula si la mitad de las ciudades (tamaño del Arraylist / 2) tiene deficit.
    }
}



