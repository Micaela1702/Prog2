package Empresa;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> personas;


    public Empresa(){
        this.personas = new ArrayList<>();
    }


    public void agregarPersona(Persona p){
        personas.add(p);
    }

    public String exportarRegistro() {
        // Creamos un StringBuilder, que nos permite construir un texto de manera eficiente
        StringBuilder sb = new StringBuilder();

        // Recorremos la lista de personas de la empresa
        for (Persona p : personas) {
            // Agregamos la representación en texto de la persona (usando su método toString())
            // Ejemplo: "Gerente - Juan Pérez - Edad: 30"
            sb.append(p.toString());

            // Agregamos un salto de línea después de cada persona para que se vea en filas separadas
            sb.append("\n");
        }

        // Convertimos el StringBuilder a un String y lo devolvemos
        // El resultado final será algo como:
        // "Gerente - Juan Pérez - Edad: 30\nSecretaria - Ana Gómez - Edad: 25\n"
        return sb.toString();
    }

}
