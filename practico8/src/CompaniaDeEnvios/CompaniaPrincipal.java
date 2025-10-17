package CompaniaDeEnvios;

public class CompaniaPrincipal {
    public static void main(String[] args) {
        EnvioSimple carta1 = new EnvioSimple("Juan", "Ana", 0.2, true, 1001);
        EnvioSimple paquete1 = new EnvioSimple("Juan", "Ana", 1.5, false, 1002);
        ComboPostal combo1 = new ComboPostal(2000);
        combo1.agregarEnvio(carta1);
        combo1.agregarEnvio(paquete1);
        ComboPostal combo2 = new ComboPostal(3000);
        combo2.agregarEnvio(combo1); // combo1 ya tiene carta1 y paquete1
        System.out.println(combo2.getPeso()); // debería seguir siendo 1.7
        System.out.println(carta1.getNroTracking()); // ahora debería ser 3000

        System.out.println(combo1.getPeso()); // 1.7
        System.out.println(carta1.getNroTracking()); // 2000
    }
}
