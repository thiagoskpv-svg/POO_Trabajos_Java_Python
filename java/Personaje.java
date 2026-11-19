// Apoyo para páginas 6 a 8 y 10. Java 17+.
public final class Personaje implements Comparable<Personaje> {
    private final String nombre;
    private final int nivel;
    private final String clase;

    public Personaje(String nombre, int nivel) {
        this(nombre, nivel, "Aventurero");
    }

    public Personaje(String nombre, int nivel, String clase) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.clase = clase;
    }

    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public String getClase() { return clase; }

    @Override
    public int compareTo(Personaje otro) {
        return Integer.compare(this.nivel, otro.nivel);
    }

    @Override
    public String toString() {
        return nombre + " (nivel " + nivel + ", " + clase + ")";
    }
}
