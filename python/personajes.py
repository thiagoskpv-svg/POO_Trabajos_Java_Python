"""PDF p. 12: composición con dataclass y propiedad de solo lectura."""
from dataclasses import dataclass


@dataclass
class Personaje:
    nombre: str
    nivel: int
    clase: str = "Aventurero"


class Equipo:
    def __init__(self):
        self._miembros: list[Personaje] = []

    def agregar(self, personaje: Personaje):
        if personaje is None:
            raise ValueError("Personaje nulo")
        self._miembros.append(personaje)

    @property
    def miembros(self) -> tuple[Personaje, ...]:
        return tuple(self._miembros)
