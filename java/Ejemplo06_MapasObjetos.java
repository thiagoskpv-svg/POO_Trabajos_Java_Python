import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// PDF, p. 10: mapas de claves objeto y agrupación por categoría.
public class Ejemplo06_MapasObjetos {
    public static void main(String[] args) {
        Personaje aria = new Personaje("Aria", 12, "Mago");
        Personaje borin = new Personaje("Borin", 4, "Guerrero");
        Map<Coordenada, Personaje> mapa = new HashMap<>();
        mapa.put(new Coordenada(2, 3), aria);
        System.out.println("Coordenada equivalente: " + mapa.get(new Coordenada(2, 3)));

        Map<String, List<Personaje>> porClase = new HashMap<>();
        for (Personaje p : List.of(aria, borin)) {
            porClase.computeIfAbsent(p.getClase(), k -> new ArrayList<>()).add(p);
        }
        System.out.println("Por clase: " + porClase);
    }
}
