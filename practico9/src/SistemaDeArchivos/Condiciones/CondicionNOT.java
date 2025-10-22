package SistemaDeArchivos.Condiciones;

import SistemaDeArchivos.ElementoSA;

public class CondicionNOT extends Buscador {
        Buscador cond;

        public CondicionNOT(Buscador cond) {
            this.cond = cond;

        }

        @Override
        public boolean cumple(ElementoSA elementoSA) {
            return !cond.cumple(elementoSA);
        }
    }

