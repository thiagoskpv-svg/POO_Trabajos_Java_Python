// PDF, p. 17: validar máximo, duplicados y nulos.
public class Ejemplo07_Invariantes {
    public static void main(String[] args) {
        EquipoPorNombre equipo = new EquipoPorNombre();
        System.out.println("Agrega Aria: " + equipo.agregar(new Personaje("Aria", 12)));
        System.out.println("Aria duplicada: " + equipo.agregar(new Personaje("Aria", 15)));
        System.out.println("Nulo: " + equipo.agregar(null));
        equipo.agregar(new Personaje("Borin", 4));
        equipo.agregar(new Personaje("Cael", 8));
        equipo.agregar(new Personaje("Dara", 15));
        System.out.println("Quinto integrante: " + equipo.agregar(new Personaje("Elio", 10)));
        System.out.println("Busca Aria: " + equipo.buscar("Aria"));
    }
}
