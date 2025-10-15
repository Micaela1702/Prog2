package Agroquimicos;

import java.util.ArrayList;

public class BuscadorPorEnfermedad extends Buscador {
    private Enfermedad enfermedad;

    public BuscadorPorEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean trata(ProductoQuimico productoQuimico) {
       return productoQuimico.trata(enfermedad);
        }
    }

