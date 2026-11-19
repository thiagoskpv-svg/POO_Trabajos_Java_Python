"""PDF p. 14: índices de objetos, clave compuesta y agrupación."""
from collections import Counter, defaultdict
from dataclasses import dataclass
from personajes import Personaje

personajes = [
    Personaje("Aria", 12, "Mago"),
    Personaje("Borin", 4, "Guerrero"),
    Personaje("Cael", 15, "Mago"),
]
indice = {p.nombre: p for p in personajes}
print("Nivel Aria:", indice["Aria"].nivel)


@dataclass(frozen=True)
class Coordenada:
    x: int
    y: int


aria = personajes[0]
mapa = {Coordenada(2, 3): aria}
print("Objeto por coordenada:", mapa[Coordenada(2, 3)])

por_clase = defaultdict(list)
for personaje in personajes:
    por_clase[personaje.clase].append(personaje)
conteo = Counter(p.clase for p in personajes)
print("Agrupados:", dict(por_clase))
print("Dos clases más comunes:", conteo.most_common(2))
