"""PDF p. 19: SOLUCIÓN del ejercicio práctico (no es un ejemplo literal del PDF)."""
from dataclasses import dataclass
from collections import defaultdict


@dataclass(frozen=True, eq=False)
class Item:
    nombre: str
    tipo: str
    peso: float
    valor: float

    def __post_init__(self):
        if not self.nombre or not self.tipo or self.peso <= 0 or self.valor < 0:
            raise ValueError("Item inválido")

    # Igualdad por nombre, igual que en la versión Java.
    def __eq__(self, otro):
        return isinstance(otro, Item) and self.nombre == otro.nombre

    def __hash__(self):
        return hash(self.nombre)


class Inventario:
    def __init__(self, max_peso: float):
        if max_peso <= 0:
            raise ValueError("Capacidad inválida")
        self._max_peso = max_peso
        self._items: list[Item] = []

    def agregar(self, item: Item | None) -> bool:
        if item is None or item in self._items or self.total_peso() + item.peso > self._max_peso:
            return False
        self._items.append(item)
        return True

    def quitar(self, nombre: str) -> bool:
        anterior = len(self._items)
        self._items = [item for item in self._items if item.nombre != nombre]
        return len(self._items) < anterior

    def buscar(self, nombre: str) -> Item | None:
        return next((item for item in self._items if item.nombre == nombre), None)

    def total_peso(self) -> float:
        return sum(item.peso for item in self._items)

    def mas_valioso(self) -> Item | None:
        return max(self._items, key=lambda item: item.valor, default=None)

    def agrupar_por_tipo(self) -> dict[str, tuple[Item, ...]]:
        grupos = defaultdict(list)
        for item in self._items:
            grupos[item.tipo].append(item)
        return {tipo: tuple(lista) for tipo, lista in grupos.items()}

    def ordenados_por_valor(self) -> list[Item]:
        return sorted(self._items, key=lambda item: (-item.valor, item.nombre))

    @property
    def items(self) -> tuple[Item, ...]:
        return tuple(self._items)


if __name__ == "__main__":
    inv = Inventario(10.0)
    print("Espada agregada:", inv.agregar(Item("Espada", "Arma", 4, 100)))
    print("Poción agregada:", inv.agregar(Item("Poción", "Consumible", 1, 40)))
    print("Duplicado:", inv.agregar(Item("Espada", "Arma", 4, 100)))
    print("Sobrepeso:", inv.agregar(Item("Armadura", "Defensa", 8, 200)))
    print("Peso:", inv.total_peso())
    print("Más valioso:", inv.mas_valioso())
    print("Buscar Espada:", inv.buscar("Espada"))
    print("Agrupados:", inv.agrupar_por_tipo())
    print("Ordenados:", inv.ordenados_por_valor())
    print("Quitar Poción:", inv.quitar("Poción"))
    print("Copia de solo lectura:", inv.items)
