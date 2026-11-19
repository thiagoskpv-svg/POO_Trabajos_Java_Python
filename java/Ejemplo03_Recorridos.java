import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// PDF, p. 7: for-each, Iterator, removeIf y streams.
public class Ejemplo03_Recorridos {
    public static void main(String[] args) {
        List<Personaje> lista = new ArrayList<>(List.of(
            new Personaje("Aria", 12),
            new Personaje("Borin", 4),
            new Personaje("Cael", 8),
            new Personaje("Dara", 15)
        ));
        for (Personaje p : lista) System.out.println("Personaje: " + p.getNombre());

        // Iterator permite borrar durante la iteración.
        Iterator<Personaje> iterador = lista.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().getNivel() < 5) iterador.remove();
        }
        lista.removeIf(p -> p.getNivel() < 5);
        List<String> fuertes = lista.stream()
            .filter(p -> p.getNivel() >= 10)
            .map(Personaje::getNombre)
            .toList();
        double promedio = lista.stream()
            .mapToInt(Personaje::getNivel)
            .average().orElse(0);
        System.out.println("Fuertes: " + fuertes);
        System.out.printf("Promedio de nivel: %.2f%n", promedio);
    }
}
