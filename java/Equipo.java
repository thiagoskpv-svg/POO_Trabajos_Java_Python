import java.util.ArrayList;
import java.util.List;

// PDF, p. 6: composición y encapsulamiento.
public class Equipo {
    private final List<Personaje> miembros = new ArrayList<>();

    public void agregar(Personaje personaje) {
        if (personaje == null) throw new IllegalArgumentException("Personaje nulo");
        miembros.add(personaje);
    }

    public List<Personaje> getMiembros() {
        return List.copyOf(miembros);
    }
}
