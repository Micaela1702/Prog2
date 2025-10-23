package SistemaElectoral;

import SistemaElectoral.Condiciones.Buscador;

public abstract class Votacion {

public abstract double buscar(Buscador condicion);
public abstract double cantidadVotos();

public  double calcularPorcentaje(Buscador condicion) {
    return buscar(condicion) / cantidadVotos() * 100; // busca que cumplan con la condicion para calcular el porcentaje
}
}
