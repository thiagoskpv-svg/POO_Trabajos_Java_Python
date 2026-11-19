// PDF, p. 6: un Equipo tiene muchos Personajes.
public class Ejemplo02_Composicion {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        equipo.agregar(new Personaje("Aria", 12));
        equipo.agregar(new Personaje("Borin", 4));
        System.out.println("Miembros: " + equipo.getMiembros());
        try {
            equipo.getMiembros().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Protegido: no se puede modificar la vista copiada.");
        }
    }
}
