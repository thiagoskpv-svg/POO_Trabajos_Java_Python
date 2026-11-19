"""PDF p. 11: list — append, insert, acceso, slicing y comprensiones."""
nombres = ["Aria", "Borin"]
nombres.append("Cael")
nombres.insert(0, "Zed")
print("Índice 1:", nombres[1])
print("Último:", nombres[-1])
print("Slice [1:3]:", nombres[1:3])
nombres.remove("Zed")
print("Eliminado con pop:", nombres.pop())
print("Cantidad:", len(nombres))
print("¿Aria?:", "Aria" in nombres)
cuadrados = [n**2 for n in range(5)]
pares = [n for n in range(10) if n % 2 == 0]
print("Cuadrados:", cuadrados)
print("Pares:", pares)
