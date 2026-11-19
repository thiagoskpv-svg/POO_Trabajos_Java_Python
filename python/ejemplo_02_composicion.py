"""PDF p. 12: Equipo y Personaje, filtrar, ordenar y promedio."""
from personajes import Equipo, Personaje

equipo = Equipo()
equipo.agregar(Personaje("Aria", 12))
equipo.agregar(Personaje("Borin", 4))
fuertes = [p.nombre for p in equipo.miembros if p.nivel >= 10]
orden = sorted(equipo.miembros, key=lambda p: p.nivel, reverse=True)
promedio = sum(p.nivel for p in equipo.miembros) / len(equipo.miembros)
print("Fuertes:", fuertes)
print("Orden:", orden)
print("Promedio:", promedio)
print("Vista inmutable:", equipo.miembros)
