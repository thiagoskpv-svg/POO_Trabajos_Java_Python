import java.util.HashMap;
import java.util.Map;

// PDF, p. 9: operaciones básicas de HashMap.
public class Ejemplo05_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> puntos = new HashMap<>();
        puntos.put("Aria", 120);
        puntos.put("Borin", 80);
        puntos.put("Aria", 150);
        System.out.println("Aria: " + puntos.get("Aria"));
        System.out.println("Zed: " + puntos.getOrDefault("Zed", 0));
        System.out.println("Existe Borin: " + puntos.containsKey("Borin"));
        puntos.putIfAbsent("Cael", 10);
        puntos.merge("Cael", 5, Integer::sum);
        puntos.remove("Borin");
        for (Map.Entry<String, Integer> e : puntos.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
