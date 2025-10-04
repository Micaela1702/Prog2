package ConvertidorMedidas;

public class SistemaConversor {

    // Constantes de conversión
    public static final double PULGADA_A_CM = 2.54;
    public static final double LIBRA_A_KG = 0.453592;
    public static final double GALON_A_LITRO = 3.78541;

   // Métodos estáticos

    public static double centimetrosAPulgadas(double cm){
        return cm / PULGADA_A_CM;
    }

    public static double pulgadasACentimetros(double pulg){
        return pulg * PULGADA_A_CM;
    }

    public static double libraAKilogramos(double lb){
        return lb * LIBRA_A_KG;
    }
    public static double kilogramosALibra(double kg){
        return kg / LIBRA_A_KG;
    }

    public static double galonesALitros(double gal){
        return gal * GALON_A_LITRO;
    }
    public static double litrosAGalones(double L){
        return L / GALON_A_LITRO;
    }

}
