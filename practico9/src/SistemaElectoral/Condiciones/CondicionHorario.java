package SistemaElectoral.Condiciones;

import SistemaElectoral.Voto;

import java.time.LocalDate;

public class CondicionHorario extends Buscador{
    private LocalDate hora1, hora2;

    public CondicionHorario(LocalDate hora1, LocalDate hora2) {
        this.hora1 = hora1;
        this.hora2 = hora2;
    }

    @Override
    public boolean cumple(Voto voto) {
        return voto.getHoraDeEmision().isAfter(hora1) && voto.getHoraDeEmision().isBefore(hora2);
    }
}
