package AcademiaVirtual;

import java.util.Arrays;


public class AcademiaPrincipal {
    public static void main(String[] args) {

        // Preguntas individuales (usando el constructor que no recibe conceptos)
        Pregunta p1 = new Pregunta("¿Qué es la herencia en Java?", 2.0, 5.0);
        p1.getListado().addAll(Arrays.asList("Herencia", "POO", "Java"));

        Pregunta p2 = new Pregunta("¿Qué es la encapsulación?", 1.5, 4.0);
        p2.getListado().addAll(Arrays.asList("Encapsulación", "POO"));

        Pregunta p3 = new Pregunta("¿Qué es una interfaz?", 2.5, 6.0);
        p3.getListado().addAll(Arrays.asList("Interfaces", "Java"));


        // Unidad secuencial: el alumno responde todas
        UnidadSecuencial unidadSecuencial = new UnidadSecuencial();
        unidadSecuencial.agregarEvaluacion(p1);
        unidadSecuencial.agregarEvaluacion(p2);

        // Unidad optativa: el alumno responde solo una
        UnidadOptativa unidadOptativa = new UnidadOptativa();
        unidadOptativa.agregarEvaluacion(p2);
        unidadOptativa.agregarEvaluacion(p3);

        // Unidad compuesta que contiene ambas
        UnidadSecuencial unidadPrincipal = new UnidadSecuencial();
        unidadPrincipal.agregarEvaluacion(unidadSecuencial);
        unidadPrincipal.agregarEvaluacion(unidadOptativa);

        // Mostrar resultados
        System.out.println("Puntaje total: " + unidadPrincipal.getPuntaje());
        System.out.println("Tiempo estimado total: " + unidadPrincipal.tiempoEstimado());
        System.out.println("Conceptos evaluados: " + unidadPrincipal.getListado());
    }
}