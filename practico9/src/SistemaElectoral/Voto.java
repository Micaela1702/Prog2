package SistemaElectoral;

import SistemaElectoral.Condiciones.Buscador;

import java.time.LocalDate;

public class Voto extends Votacion {
    private Candidato candidato;
    private LocalDate horaDeEmision;

    public Voto(Candidato candidato) {
        this.horaDeEmision = LocalDate.now(); // momento en el que se crea el voto
        this.candidato = candidato;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public LocalDate getHoraDeEmision() {
        return horaDeEmision;
    }

    public void setHoraDeEmision(LocalDate horaDeEmision) {
        this.horaDeEmision = horaDeEmision;
    }

    @Override
    public double buscar(Buscador condicion) {
        if (condicion.cumple(this)) { // si yo como voto, cumplo la condición, sumo uno
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public double cantidadVotos() {
        return 1;
    }
}
