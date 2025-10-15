package Agroquimicos;


public class BuscadorPorCultivo extends Buscador {
   private Cultivo cultivo;

    public BuscadorPorCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    @Override
    public boolean trata(ProductoQuimico productoQuimico) {
        return productoQuimico.puedeAplicarseEn(cultivo);
    }
}
