"""PDF p. 11-12: sort (modifica) vs sorted (crea una lista nueva)."""
from personajes import Personaje

personajes = [Personaje("Dara", 10), Personaje("Aria", 15), Personaje("Borin", 4)]
ordenados = sorted(personajes, key=lambda p: (-p.nivel, p.nombre))
print("Original:", personajes)
print("Ordenados nivel desc/nombre:", ordenados)
personajes.sort(key=lambda p: p.nombre)
print("Lista modificada en sitio:", personajes)
