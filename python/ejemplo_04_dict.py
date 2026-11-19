"""PDF p. 13: dict, claves, valores, comprehensions y orden."""
puntos = {"Aria": 120, "Borin": 80}
puntos["Cael"] = 10
print("Aria:", puntos["Aria"])
print("Zed por defecto:", puntos.get("Zed", 0))
print("¿Borin?:", "Borin" in puntos)
puntos.setdefault("Zed", 0)
puntos.pop("Borin")
for nombre, valor in puntos.items():
    print(nombre, valor)
doble = {nombre: valor * 2 for nombre, valor in puntos.items()}
top = sorted(puntos.items(), key=lambda par: par[1], reverse=True)
print("Doble:", doble)
print("Por valor descendente:", top)
