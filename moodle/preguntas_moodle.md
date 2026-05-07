# Banco de preguntas para Moodle
# Cuestionario: Recorridos en Árboles Binarios

---

### Pregunta 6
**¿Qué recorrido usarías para liberar la memoria de un árbol binario?**

*   A. Preorden
*   B. Inorden
*   **C. Postorden** 
*   D. BFS

> **Explicación:** El recorrido **Postorden** (Izquierda, Derecha, Raíz) asegura que los nodos hijos se eliminen antes que el nodo padre, evitando perder la referencia a los hijos y permitiendo una liberación de memoria segura.

---

### Pregunta 7
**¿Cuál es la complejidad temporal de los recorridos DFS en un árbol con $n$ nodos?**

*   A. $O(\log n)$
*   **B. $O(n)$** 
*   C. $O(n^2)$
*   D. $O(2^n)$

> **Explicación:** Tanto en Preorden, Inorden como Postorden, se visita cada nodo exactamente una vez, por lo que el tiempo de ejecución es proporcional al número total de nodos.

---

### Pregunta 8
**¿Qué estructura de datos auxiliar utiliza BFS (Breadth-First Search)?**

*   A. Pila
*   **B. Cola** 
*   C. Lista enlazada
*   D. Vector

> **Explicación:** BFS explora nivel por nivel. Una **Cola** (FIFO) permite procesar los nodos en el orden en que fueron descubiertos.

---

### Pregunta 9
**Dado el árbol: 5 - 3 - 8 - 1 - 4 - 7 - 9 ¿Cuál es el resultado del recorrido Preorden?**

*   A. 1, 3, 4, 5, 7, 8, 9
*   **B. 5, 3, 1, 4, 8, 7, 9** 
*   C. 1, 4, 3, 7, 9, 8, 5
*   D. 5, 3, 8, 1, 4, 7, 9

> **Explicación:** El recorrido Preorden sigue la secuencia: **Raíz → Izquierda → Derecha**. 
> 1. Raíz: **5**
> 2. Subárbol Izquierdo: **3, 1, 4**
> 3. Subárbol Derecho: **8, 7, 9**

---

### Pregunta 10 (Verdadero/Falso)
**El recorrido BFS se puede implementar de forma natural con recursividad.**

*   A. Verdadero
*   **B. Falso** 

> **Explicación:** A diferencia de DFS (que usa la pila de llamadas de la recursividad), BFS requiere una estructura de **Cola** para explorar niveles. Aunque se puede simular, no es la forma natural ni eficiente de implementarlo.
## Preguntas tipo opción múltiple

1. ¿Cuál es el orden del recorrido Inorden?
   - A. Raíz, izquierda, derecha
   - B. Izquierda, raíz, derecha
   - C. Izquierda, derecha, raíz
   - D. Nivel por nivel
   - Respuesta: B

2. ¿Qué estructura utiliza BFS?
   - A. Pila
   - B. Lista circular
   - C. Cola
   - D. Árbol AVL
   - Respuesta: C

3. ¿Cuál recorrido visita primero la raíz?
   - A. Inorden
   - B. Preorden
   - C. Postorden
   - D. BFS únicamente
   - Respuesta: B

4. ¿Cuál recorrido procesa la raíz al final?
   - A. Preorden
   - B. Inorden
   - C. Postorden
   - D. Nivel por nivel
   - Respuesta: C

5. En un BST, el recorrido Inorden permite obtener:
   - A. Elementos desordenados
   - B. Elementos por niveles
   - C. Elementos en orden ascendente
   - D. Solo hojas
   - Respuesta: C

## Pregunta práctica
Complete el código C++ del recorrido inorden:

```cpp
void inorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    _____________(raiz->izquierda);
    cout << raiz->dato << " ";
    _____________(raiz->derecha);
}
```

Respuesta esperada: inorden
