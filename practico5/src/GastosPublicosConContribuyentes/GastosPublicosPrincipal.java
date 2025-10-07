package GastosPublicosConContribuyentes;

public class GastosPublicosPrincipal {
    public static void main(String[] args) {

        // Crear ciudades
        Ciudad tandil = new Ciudad("Tandil");
        Ciudad laPlata = new Ciudad("La Plata");
        Ciudad marDelPlata = new Ciudad("Mar del Plata");
        // Agregar contribuyentes a Tandil
        tandil.agregarContribuyente(new ContribuyenteSimple("Ana Gómez", "CUIT123", 10000));
        tandil.agregarContribuyente(new ContribuyenteComerciante("Carlos Pérez", "CUIT456", 8000, 500000));
        tandil.agregarContribuyente(new ContribuyenteProgramador("Lucía Torres", "CUIT789", 12000, 300000));

        // Agregar contribuyentes a La Plata
        laPlata.agregarContribuyente(new ContribuyenteSimple("Mario Díaz", "CUIT321", 9500));
        laPlata.agregarContribuyente(new ContribuyenteComerciante("Sofía Ruiz", "CUIT654", 7000, 400000));

        // Agregar contribuyentes a Mar del Plata
        marDelPlata.agregarContribuyente(new ContribuyenteProgramador("Federico López", "CUIT987", 11000, 250000));

        // Mostrar total recaudado por cada ciudad
        System.out.println("Impuestos recaudados por ciudad:");
        System.out.println("Tandil: $" + tandil.getRecaudacionTotal());
        System.out.println("La Plata: $" + laPlata.getRecaudacionTotal());
        System.out.println("Mar del Plata: $" + marDelPlata.getRecaudacionTotal());

    }
}
