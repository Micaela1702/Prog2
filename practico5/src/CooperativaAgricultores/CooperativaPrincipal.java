package CooperativaAgricultores;

public class Principal {
    public static void main(String[] args) {
        Cooperativa coop = new Cooperativa("Tandil");

        Lote l1 = new Lote("El gallo", 40);
        l1.agregarMineral("Fosforo");
        l1.agregarMineral("Hierro");
        Lote l2 = new Lote("Iraola", 60);
        l2.agregarMineral("Magnesio");

        Cereal maiz = new Cereal("Maiz");
        maiz.agregarMineral("Fosforo");
        Cereal trigo = new Cereal("Trigo");
        trigo.agregarMineral("Magnesio");
        trigo.agregarMineral("Hierro");
        Pastura alfalfa = new Pastura("Alfalfa", 50);
        alfalfa.agregarMineral("Magnesio");

        coop.agregarCereales(alfalfa);
        coop.agregarCereales(trigo);
        coop.agregarCereales(maiz);

        coop.agregarLote(l1);
        coop.agregarLote(l2);
        coop.agregarMineralPrimario("hierro");

        System.out.println(coop.listarCerealParaLote(l1));
        System.out.println(coop.listarCerealParaLote(l2));
        System.out.println(coop.listarLoteParaCereal(maiz));
        System.out.println(coop.listarLoteParaCereal(trigo));
        System.out.println(coop.listarLoteParaCereal(alfalfa));

        System.out.println(coop.esEspecial(l1));
        System.out.println(coop.esEspecial(l2));


    }

}
