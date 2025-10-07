package CooperativaAgricultores;

import java.util.ArrayList;

public class Cooperativa {

    private String nombre;
    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;

    private ArrayList<String> mineralesPrimarios;
    private ArrayList<String> mineralesSecundarios;


    public Cooperativa(String nombre) {
        this.nombre = nombre;
        this.cereales = new ArrayList<>();
        this.lotes = new ArrayList<>();
        this.mineralesPrimarios = new ArrayList<>();
        this.mineralesSecundarios = new ArrayList<>();
    }

    public void agregarLote(Lote nuevo){
        this.lotes.add(nuevo);

    }
    public void agregarCereales(Cereal nuevo){
        if(!this.cereales.contains(nuevo)){
            cereales.add(nuevo);
        }
    }
    public void agregarMineralPrimario(String mineralN){
        if(!this.mineralesPrimarios.contains(mineralN)){
            mineralesPrimarios.add(mineralN);
        }
    }
    // Si tiene un mineral primario, es especial
    public boolean esEspecial(Lote lote){
        for (int i=0; i < lotes.size(); i++){
            if(lote.tieneMineral(this.mineralesPrimarios.get(i))){
                return true;
            }
        }
    return false;
}

    public ArrayList<Cereal> listarCerealParaLote(Lote lote){
        ArrayList<Cereal> resultados = new ArrayList<>(); // se crea uno nuevo para copiar los valores, y no modificar el original
        for (Cereal cereal_i : cereales) {
            if (cereal_i.esApto(lote)) {
                resultados.add(cereal_i);
            }
        }
        return resultados;
    }

    public ArrayList<Lote> listarLoteParaCereal(Cereal cereal){
        ArrayList<Lote> resultados = new ArrayList<>(); // se crea uno nuevo para copiar los valores, y no modificar el original
        for (Lote lote_i : lotes) {
            if (lote_i.esApto(cereal)) {
                resultados.add(lote_i);
            }
        }
        return resultados;
    }
}

