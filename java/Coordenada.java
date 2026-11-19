import java.util.Objects;

// PDF, p. 10: iguales por valor y hash coherente.
public final class Coordenada {
    private final int x;
    private final int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Coordenada otra)) return false;
        return x == otra.x && y == otra.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
