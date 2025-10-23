package SistemaElectoral.Condiciones;

import SistemaElectoral.Candidato;
import SistemaElectoral.Voto;

public class CondicionPorCandidato extends Buscador {
    private Candidato candidato;

    public CondicionPorCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    @Override
    public boolean cumple(Voto voto) {
        return voto.getCandidato().equals(candidato);
    }
}
