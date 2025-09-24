package GastosPublicos;

public class Main {
    public static void main(String[] args) {
        Pais argentina = new Pais("Argentina");

        Provincia bsas = new Provincia("Buenos Aires");
        Provincia cordoba = new Provincia("Córdoba");

        // Crear ciudades con sus gastos y habitantes
        Ciudad tandil = new Ciudad("Tandil", "Buenos Aires", 60000, 140000);
        Ciudad laPlata = new Ciudad("La Plata", "Buenos Aires", 100000, 800000);
        Ciudad marDelPlata = new Ciudad("Mar del Plata", "Buenos Aires", 200000, 700000);

        bsas.agregarCiudad(tandil);
        bsas.agregarCiudad(laPlata);
        bsas.agregarCiudad(marDelPlata);

        argentina.agregarProvincia(bsas);
        argentina.agregarProvincia(cordoba);

        System.out.println("Ciudades deficitarias en el país:");
        for (Ciudad c : argentina.getCiudadesConDeficit()) {
            System.out.println(" - " + c);
        }

        System.out.println("Provincias críticas:");
        for (Provincia p : argentina.getProvinciasCriticas()) {
            System.out.println(" - " + p);
        }
    }
}
