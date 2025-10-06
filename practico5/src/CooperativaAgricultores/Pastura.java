package CooperativaAgricultores;

public class Pastura extends Cereal {

    public int supMinima;

    public Pastura(String nom, int supMinima) {
        super(nom);
        this.supMinima = supMinima;
    }

    public int getSupMinima() {
        return supMinima;
    }

    public void setSupMinima(int supMinima) {
        this.supMinima = supMinima;
    }

    @Override
    public boolean esApto(Lote lote){ // controla que el tamaño sea mayor o igual a la sup minima (req del enunciado). Y luego, llama
                                      // al super de lote, con la función es apto para chequear que además de controlar la superficie,
                                      // controle los minerales requeridos.
        if(lote.getTamanio() >= this.getSupMinima()){
            return super.esApto(lote);
        }
        return false;
   }
}
