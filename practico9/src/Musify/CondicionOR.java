package Musify;

public class CondicionOR extends Buscador{
    private Buscador cond1, cond2;

    public CondicionOR(Buscador cond1, Buscador cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }


    @Override
    public boolean cumple(PistaDeMusica pistaDeMusica) {
        return cond1.cumple(pistaDeMusica) || cond2.cumple(pistaDeMusica);
    }
}
