

## Trabajo 1 — Ejemplos del PDF

Se organizaron los ejemplos por lenguaje y en orden de aparición. Se adaptaron los fragmentos incompletos para que los programas sean ejecutables y compartan clases reutilizables. Los códigos agregan impresiones de resultados y datos de prueba, porque en el PDF algunas expresiones se muestran sin salida o dependen de variables no definidas.

| Sección PDF | Java | Python |
|---|---|---|
| Colecciones, composición (p. 3, 6, 12) | `java/Personaje.java`, `java/Equipo.java`, `java/Ejemplo02_Composicion.java` | `python/personajes.py`, `python/ejemplo_02_composicion.py` |
| ArrayList / list básicos (p. 5, 11) | `java/Ejemplo01_ArrayList.java` | `python/ejemplo_01_list.py` |
| Recorrer, filtrar, ordenar (p. 7-8, 12) | `java/Ejemplo03_Recorridos.java`, `java/Ejemplo04_Ordenacion.java` | `python/ejemplo_03_listas_orden.py` |
| HashMap / dict (p. 9, 13) | `java/Ejemplo05_HashMap.java` | `python/ejemplo_04_dict.py` |
| Mapas con objetos e índices (p. 10, 14) | `java/Coordenada.java`, `java/Ejemplo06_MapasObjetos.java` | `python/ejemplo_05_indices_agrupacion.py` |
| Invariantes del diseño (p. 16-17) | `java/EquipoPorNombre.java`, `java/Ejemplo07_Invariantes.java` | `python/ejemplo_06_invariantes.py` |
| Ejercicio propuesto (p. 19) | `java/Ejemplo08_Inventario.java` | `python/ejemplo_07_inventario.py` |

Las páginas 4, 15, 18 y 20 son explicativas y se recogen en `TEORIA_Y_COMPARACIONES.md`. La página 1 es portada y la 2 contiene el índice.

## Ejecutar (Java 17 o superior)

Abrir una terminal dentro de la carpeta `java` y ejecutar:

```bash
javac -encoding UTF-8 *.java
java Ejemplo01_ArrayList
java Ejemplo02_Composicion
java Ejemplo03_Recorridos
java Ejemplo04_Ordenacion
java Ejemplo05_HashMap
java Ejemplo06_MapasObjetos
java Ejemplo07_Invariantes
java Ejemplo08_Inventario
```

## Ejecutar (Python 3.10 o superior)

Desde la carpeta raíz del repositorio:

```bash
python python/ejemplo_01_list.py
python python/ejemplo_02_composicion.py
python python/ejemplo_03_listas_orden.py
python python/ejemplo_04_dict.py
python python/ejemplo_05_indices_agrupacion.py
python python/ejemplo_06_invariantes.py
python python/ejemplo_07_inventario.py
```


