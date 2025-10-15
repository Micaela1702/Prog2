package Vivero;
import java.util.ArrayList;
import java.util.List;

public class MainVivero {
        public static void main(String[] args) {
            List<Planta> vivero = new ArrayList<>();
            vivero.add(new Planta("Epipremnum aureum", new ArrayList<>(List.of("potus", "pothos", "potos")), "Epipremnum", "Araceae", "Monocotyledoneae", 4, 3));
            vivero.add(new Planta("Sansevieria trifasciata", new ArrayList<>(List.of("lengua de suegra", "espada de San Jorge")), "Sansevieria", "Asparagaceae", "Monocotyledoneae", 8, 2));
            vivero.add(new Planta("Crassula ovata", new ArrayList<>(List.of("árbol de jade")), "Crassula", "Crassulaceae", "Dicotyledoneae", 7, 1));
            vivero.add(new Planta("Ficus benjamina", new ArrayList<>(List.of("ficus")), "Ficus", "Moraceae", "Dicotyledoneae", 3, 6));
            vivero.add(new Planta("Aloe vera", new ArrayList<>(List.of("sábila")), "Aloe", "Asphodelaceae", "Monocotyledoneae", 9, 2));

            Buscador filtro = new SolyRiego(5, ">", 3, "<");

            System.out.println("🌿 Plantas que cumplen con sol > 5 y riego < 3:");
            for (Planta p : vivero) {
                if (filtro.cumple(p)) System.out.println("✅ " + p.getNombreCientifico());
            }
        }
    }
