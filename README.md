# Recorridos de Arboles Binarios - Estructura de Datos

**Universidad Tecnica de Ambato**  
**Carrera:** Ingenieria de Software  
**Estudiante:** Daky Fernando Fueres Perugachi  
**Curso:** Tercero "B"  
**Fecha:** Mayo 2026  

## Descripcion

Implementacion de recorridos en arboles binarios:

- Preorden (Raiz -> Izquierda -> Derecha)
- Inorden (Izquierda -> Raiz -> Derecha)
- Postorden (Izquierda -> Derecha -> Raiz)
- BFS (Nivel por nivel con cola)

## Estructura del proyecto

Recorridos-Arboles-Binarios-UTA/
├── src/
│   ├── cpp/
│   │   └── main.cpp
│   └── java/
│       └── Main.java
├── README.md
└── informe.pdf

## Ejecucion

### C++

cd src/cpp
g++ main.cpp -o recorridos
./recorridos

### Java

cd src/java
javac Main.java
java Main

## Resultados

### Arbol base (7 nodos)

| Recorrido | Secuencia |
|-----------|-----------|
| Preorden | 10, 5, 2, 7, 15, 12, 20 |
| Inorden | 2, 5, 7, 10, 12, 15, 20 |
| Postorden | 2, 7, 5, 12, 20, 15, 10 |
| BFS | 10, 5, 15, 2, 7, 12, 20 |

### Arbol extendido con nodos 1, 3, 18, 25 (11 nodos)

| Recorrido | Secuencia |
|-----------|-----------|
| Preorden | 10, 5, 2, 1, 3, 7, 15, 12, 20, 18, 25 |
| Inorden | 1, 2, 3, 5, 7, 10, 12, 15, 18, 20, 25 |
| Postorden | 1, 3, 2, 7, 5, 12, 18, 25, 20, 15, 10 |
| BFS | 10, 5, 15, 2, 7, 12, 20, 1, 3, 18, 25 |

### Estadisticas

| Arbol | Total nodos | Total hojas |
|-------|-------------|-------------|
| Base | 7 | 4 |
| Extendido | 11 | 6 |

## Caso aplicado - Sistema de Gimnasio

Estructura del sistema:

           Sistema Gimnasio
          /           \
      Clientes        Pagos
       /    \          /    \
  Registrar Actualizar Procesar Reportar

### Aplicacion de recorridos

| Objetivo | Recorrido | Justificacion |
|----------|-----------|----------------|
| Mostrar menu principal | Preorden | Visita la raiz (Sistema Gimnasio) antes que los submenus |
| Procesar modulos internos primero | Postorden | Procesa las hojas antes que los nodos padres |
| Mostrar modulos nivel por nivel | BFS | Ideal para interfaces por niveles o dashboard |

### Recorridos del sistema

| Recorrido | Secuencia |
|-----------|-----------|
| Preorden | 1, 2, 4, 5, 3, 6, 7 |
| Inorden | 4, 2, 5, 1, 6, 3, 7 |
| Postorden | 4, 5, 2, 6, 7, 3, 1 |
| BFS | 1, 2, 3, 4, 5, 6, 7 |

Leyenda: 1=Sistema Gimnasio, 2=Clientes, 3=Pagos, 4=Registrar, 5=Actualizar, 6=Procesar, 7=Reportar

## Preguntas de reflexion

1. Que recorrido sirve para ordenar valores en un BST?
Respuesta: Inorden. Produce los valores en orden ascendente.

2. Que diferencia existe entre DFS y BFS?
Respuesta: DFS explora en profundidad usando recursividad o pila. BFS explora por niveles usando una cola.

3. Por que BFS requiere una cola?
Respuesta: Porque necesita procesar nodos en orden FIFO (primero en entrar, primero en salir).

4. En que caso real se puede usar Preorden?
Respuesta: Para serializar un arbol o copiar su estructura.

5. En que caso real se puede usar Postorden?
Respuesta: Para liberar memoria de un arbol eliminando hijos antes que el padre.

## Tecnologias utilizadas

- C++ (compilador g++)
- Java (JDK 8 o superior)
- GitHub para control de versiones

## Conclusiones

- Los recorridos DFS se implementan naturalmente con recursividad
- BFS requiere una cola para garantizar el orden por niveles
- C++ y Java tienen sintaxis diferente pero logica identica
- Inorden en un BST produce orden ascendente
- Los recorridos tienen aplicaciones practicas en desarrollo de software

## Enlace del repositorio

https://github.com/TU-USUARIO/Recorridos-Arboles-Binarios-UTA

## Autor

Daky Fernando Fueres Perugachi - Tercero "B" - Estructura de Datos

## Licencia

MIT License
## Objetivo general
Implementar y analizar los principales recorridos de árboles binarios utilizando C++ y Java, aplicando estructuras de datos dinámicas, recursividad y colas.

## Resultados de aprendizaje
Al finalizar la práctica, el estudiante será capaz de:

1. Explicar la diferencia entre recorridos DFS y BFS.
2. Implementar recorridos Inorden, Preorden y Postorden con recursividad.
3. Implementar BFS usando una cola.
4. Comparar la implementación en C++ y Java.
5. Aplicar recorridos de árboles a un caso real del proyecto final.

## Contenido

| Carpeta | Descripción |
|---|---|
| `docs/` | Guía práctica para la clase |
| `src/cpp/` | Implementación completa en C++ |
| `src/java/` | Implementación completa en Java |
| `exercises/` | Ejercicios para trabajo grupal |
| `moodle/` | Banco de preguntas tipo Moodle |
| `assets/` | Recursos de apoyo |

## Reglas de recorrido

| Recorrido | Orden |
|---|---|
| Inorden | Izquierda → Raíz → Derecha |
| Preorden | Raíz → Izquierda → Derecha |
| Postorden | Izquierda → Derecha → Raíz |
| BFS | Nivel por nivel usando cola |

## Ejecución en C++

```bash
cd src/cpp
g++ main.cpp -o recorridos
./recorridos
```

## Ejecución en Java

```bash
cd src/java
javac Main.java
java Main
```

## Actividad  sugerida:

1. Clonar el repositorio.
2. Ejecutar el código base.
3. Agregar mínimo 5 nodos nuevos.
4. Mostrar los cuatro recorridos.
5. Modificar el caso de aplicación al proyecto final.
6. Subir evidencias al repositorio GitHub del grupo.

## Entregables

- Captura de ejecución en consola.
- Código fuente comentado.
- README del grupo.
- Explicación del caso real.
- Link del repositorio GitHub.

## Rúbrica breve sobre 10 puntos

| Criterio | Puntaje |
|---|---:|
| Implementación correcta de recorridos | 3 |
| Uso correcto de recursividad y cola | 2 |
| Código comentado y organizado | 1.5 |
| Aplicación al proyecto final | 2 |
| Uso de GitHub e IA documentada | 1.5 |
