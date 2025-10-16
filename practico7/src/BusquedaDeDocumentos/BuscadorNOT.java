package BusquedaDeDocumentos;

public class BuscadorNOT extends Buscador {
    private Buscador cond1;

    public BuscadorNOT(Buscador cond1) {
        this.cond1 = cond1;
    }

    @Override
    public boolean cumple(Documento documento) {
        return !cond1.cumple(documento);
    }
}

