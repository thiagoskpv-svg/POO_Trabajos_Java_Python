"""PDF p. 17: reglas del dominio en Equipo (capacidad y duplicados)."""
from personajes import Personaje


class Equipo:
    MAX = 4

    def __init__(self):
        self._por_nombre: dict[str, Personaje] = {}

    def agregar(self, p: Personaje) -> bool:
        if p is None:
            return False
        if len(self._por_nombre) >= self.MAX:
            return False
        if p.nombre in self._por_nombre:
            return False
        self._por_nombre[p.nombre] = p
        return True

    def buscar(self, nombre: str) -> Personaje | None:
        return self._por_nombre.get(nombre)


if __name__ == "__main__":
    equipo = Equipo()
    print("Agrega Aria:", equipo.agregar(Personaje("Aria", 12)))
    print("Aria duplicada:", equipo.agregar(Personaje("Aria", 15)))
    print("Nulo:", equipo.agregar(None))
    for nombre in ["Borin", "Cael", "Dara"]:
        equipo.agregar(Personaje(nombre, 8))
    print("Quinto integrante:", equipo.agregar(Personaje("Elio", 10)))
    print("Busca Aria:", equipo.buscar("Aria"))
