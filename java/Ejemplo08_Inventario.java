import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

// PDF, p. 19: SOLUCIÓN DEL EJERCICIO PROPUESTO (no es código literal del PDF).
public class Ejemplo08_Inventario {
    static final class Item {
        private final String nombre, tipo;
        private final double peso, valor;
        Item(String nombre, String tipo, double peso, double valor) {
            if (nombre == null || nombre.isBlank() || tipo == null || tipo.isBlank()
                || peso <= 0 || valor < 0) throw new IllegalArgumentException("Item inválido");
            this.nombre = nombre; this.tipo = tipo;
            this.peso = peso; this.valor = valor;
        }
        String getNombre() { return nombre; }
        String getTipo() { return tipo; }
        double getPeso() { return peso; }
        double getValor() { return valor; }
        @Override public boolean equals(Object obj) {
            if (!(obj instanceof Item otro)) return false;
            return nombre.equals(otro.nombre); // Nombre único en este inventario.
        }
        @Override public int hashCode() { return Objects.hash(nombre); }
        @Override public String toString() { return nombre + " ($" + valor + ")"; }
    }

    static final class Inventario {
        private final double maxPeso;
        private final List<Item> items = new ArrayList<>();
        Inventario(double maxPeso) {
            if (maxPeso <= 0) throw new IllegalArgumentException("Capacidad inválida");
            this.maxPeso = maxPeso;
        }
        boolean agregar(Item item) {
            if (item == null || items.contains(item) || totalPeso() + item.getPeso() > maxPeso)
                return false;
            return items.add(item);
        }
        boolean quitar(String nombre) { return items.removeIf(i -> i.getNombre().equals(nombre)); }
        Optional<Item> buscar(String nombre) {
            return items.stream().filter(i -> i.getNombre().equals(nombre)).findFirst();
        }
        double totalPeso() { return items.stream().mapToDouble(Item::getPeso).sum(); }
        Optional<Item> masValioso() {
            return items.stream().max(Comparator.comparingDouble(Item::getValor));
        }
        Map<String, List<Item>> agruparPorTipo() {
            Map<String, List<Item>> resultado = new HashMap<>();
            for (Item item : items) resultado.computeIfAbsent(item.getTipo(), k -> new ArrayList<>()).add(item);
            resultado.replaceAll((k, v) -> List.copyOf(v));
            return Map.copyOf(resultado);
        }
        List<Item> ordenarPorValor() {
            return items.stream().sorted(Comparator.comparingDouble(Item::getValor)
                .reversed().thenComparing(Item::getNombre)).toList();
        }
        List<Item> consultar() { return List.copyOf(items); }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario(10.0);
        System.out.println("Espada agregada: " + inventario.agregar(new Item("Espada", "Arma", 4, 100)));
        System.out.println("Poción agregada: " + inventario.agregar(new Item("Poción", "Consumible", 1, 40)));
        System.out.println("Duplicado: " + inventario.agregar(new Item("Espada", "Arma", 4, 100)));
        System.out.println("Sobrepeso: " + inventario.agregar(new Item("Armadura", "Defensa", 8, 200)));
        System.out.println("Peso: " + inventario.totalPeso());
        System.out.println("Más valioso: " + inventario.masValioso());
        System.out.println("Buscar Espada: " + inventario.buscar("Espada"));
        System.out.println("Agrupados: " + inventario.agruparPorTipo());
        System.out.println("Ordenados: " + inventario.ordenarPorValor());
        System.out.println("Quitar Poción: " + inventario.quitar("Poción"));
        System.out.println("Copia de solo lectura: " + inventario.consultar());
    }
}
