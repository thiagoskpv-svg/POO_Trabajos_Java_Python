import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// PDF, p. 8: Comparable y Comparator.
public class Ejemplo04_Ordenacion {
    public static void main(String[] args) {
        List<Personaje> lista = new ArrayList<>(List.of(
            new Personaje("Dara", 10), new Personaje("Aria", 15),
            new Personaje("Cael", 10), new Personaje("Borin", 4)
        ));
        Collections.sort(lista); // Nivel ascendente (Comparable).
        System.out.println("Orden natural: " + lista);
        lista.sort(Comparator.comparing(Personaje::getNombre));
        System.out.println("Por nombre: " + lista);
        lista.sort(Comparator.comparingInt(Personaje::getNivel)
            .reversed().thenComparing(Personaje::getNombre));
        System.out.println("Nivel descendente y nombre: " + lista);
    }
}
