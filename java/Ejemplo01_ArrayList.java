import java.util.ArrayList;
import java.util.List;

// PDF, p. 5: ArrayList, operaciones esenciales.
public class Ejemplo01_ArrayList {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Aria");
        nombres.add(0, "Borin");
        System.out.println("get(1): " + nombres.get(1));
        nombres.set(1, "Cael");
        nombres.remove("Borin");
        System.out.println("contains Cael: " + nombres.contains("Cael"));
        System.out.println("indexOf Cael: " + nombres.indexOf("Cael"));
        System.out.println("size: " + nombres.size());
        System.out.println("isEmpty: " + nombres.isEmpty());
        nombres.remove(0);
        nombres.clear();
        System.out.println("Lista vacía: " + nombres);
    }
}
