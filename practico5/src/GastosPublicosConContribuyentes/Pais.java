package GastosPublicosConContribuyentes;

import java.util.ArrayList;

public class Pais {
  private String nombre;
  private ArrayList<Provincia> provincias;

  public Pais(String nombre) {
    this.nombre = nombre;
    this.provincias = new ArrayList<>();
  }

  public void agregarProvincia(Provincia p1) {
    provincias.add(p1);
  }

  public ArrayList<Provincia> getProvincias() {
    return provincias;
  }

  public ArrayList<Ciudad> getCiudadesConDeficit() { // devuelve una lista con las ciudades que son deficitarias.
    ArrayList<Ciudad> deficitarias = new ArrayList<>();
    for (Provincia p : provincias) {
      for (Ciudad c : p.getCiudad()) {
        if (c.tieneDeficit()) {
          deficitarias.add(c);
        }
      }
    }
    return deficitarias;
  }

  // Listar las provincias con más de la mitad de sus ciudades en déficit
  public ArrayList<Provincia> getProvinciasCriticas(){
    ArrayList<Provincia> provinciasCriticas = new ArrayList<>();
    for (Provincia p : provincias){
      for (Ciudad c : p.getCiudad()){
        if(p.enCondicionDeDeficit()){
          provinciasCriticas.add(p);
        }
      }
    }
    return provinciasCriticas;
  }

}
