import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// PDF, p. 17: no se permite nulo, nombre duplicado ni más de cuatro integrantes.
public class EquipoPorNombre {
    private static final int MAX = 4;
    private final Map<String, Personaje> porNombre = new HashMap<>();

    public boolean agregar(Personaje personaje) {
        if (personaje == null) return false;
        if (porNombre.size() >= MAX) return false;
        if (porNombre.containsKey(personaje.getNombre())) return false;
        porNombre.put(personaje.getNombre(), personaje);
        return true;
    }

    public Optional<Personaje> buscar(String nombre) {
        return Optional.ofNullable(porNombre.get(nombre));
    }
}
