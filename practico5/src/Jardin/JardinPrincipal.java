package AgendaPersonal;

public class Main {
    public static void main(String[] args) {

        agendaPersonal a1 = new agendaPersonal();
        agendaPersonal a2 = new agendaPersonal();
        Reunion r1 = new Reunion("Oficina 4", "otra cosa", 0, 10.30, 11.30);
        Reunion r2 = new Reunion("Oficina 4", "gastos", 0, 10.00, 12.00);
        Persona p1 = new Persona("Juan", "1122334455", "juan@mail.com");
        Persona p2 = new Persona("María", "1144556677", "maria@mail.com");


        a1.agregarReunion(r1);
        a2.agregarReunion(r2);
        r1.agregarParticipante(p1);
        r2.agregarParticipante(p2);

        r1.sethoraInicio(10.30);
        r1.sethoraFin(11.30);
        r2.sethoraInicio(10.00);
        r2.sethoraFin(11.00);



       // System.out.println(r1.toString());

        System.out.println("Participantes reunión 1:");
        for (Persona p : r1.getParticipantes()) {
            System.out.println(p);
        }

        System.out.println("Participantes reunión 2:");
        for (Persona p : r2.getParticipantes()) {
            System.out.println(p);
        }

        System.out.println("¿Hay conflicto de horarios?");
        a1.agregarReunion(r1);
    }
}