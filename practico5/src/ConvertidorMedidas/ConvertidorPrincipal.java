package ConvertidorMedidas;


public class ConvertidorPrincipal {
    public static void main(String[] args) {
        System.out.println("10 cm son " + SistemaConversor.centimetrosAPulgadas(10) + " pulgadas");
        System.out.println("5 galones son " + SistemaConversor.galonesALitros(5) + " litros");
    }
}
