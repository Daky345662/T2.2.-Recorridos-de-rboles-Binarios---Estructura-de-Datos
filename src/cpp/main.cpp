#include <iostream>
#include <queue>
using namespace std;

// Estructura del nodo
struct Nodo {
    int dato;
    Nodo* izquierda;
    Nodo* derecha;

    Nodo(int valor) {
        dato = valor;
        izquierda = nullptr;
        derecha = nullptr;
    }
};

// ========== RECORRIDOS PRINCIPALES ==========

void preorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    cout << raiz->dato << " ";
    preorden(raiz->izquierda);
    preorden(raiz->derecha);
}

void inorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    inorden(raiz->izquierda);
    cout << raiz->dato << " ";
    inorden(raiz->derecha);
}

void postorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    postorden(raiz->izquierda);
    postorden(raiz->derecha);
    cout << raiz->dato << " ";
}

void bfs(Nodo* raiz) {
    if (raiz == nullptr) return;
    queue<Nodo*> cola;
    cola.push(raiz);

    while (!cola.empty()) {
        Nodo* actual = cola.front();
        cola.pop();
        cout << actual->dato << " ";
        if (actual->izquierda != nullptr) cola.push(actual->izquierda);
        if (actual->derecha != nullptr) cola.push(actual->derecha);
    }
}

// ========== FUNCIONES ADICIONALES ==========

void imprimirConFormato(string titulo, void (*recorrido)(Nodo*), Nodo* arbol) {
    cout << titulo << ": ";
    recorrido(arbol);
    cout << endl;
}

void imprimirArbolBonito(Nodo* raiz, int nivel = 0) {
    if (raiz == nullptr) return;
    imprimirArbolBonito(raiz->derecha, nivel + 1);
    for (int i = 0; i < nivel; i++) cout << "    ";
    cout << raiz->dato << endl;
    imprimirArbolBonito(raiz->izquierda, nivel + 1);
}

// ========== CONTAR NODOS ==========
int contarNodos(Nodo* raiz) {
    if (raiz == nullptr) return 0;
    return 1 + contarNodos(raiz->izquierda) + contarNodos(raiz->derecha);
}

// ========== CONTAR HOJAS ==========
int contarHojas(Nodo* raiz) {
    if (raiz == nullptr) return 0;
    if (raiz->izquierda == nullptr && raiz->derecha == nullptr) return 1;
    return contarHojas(raiz->izquierda) + contarHojas(raiz->derecha);
}

// ========== FUNCIÓN PRINCIPAL ==========
int main() {
    cout << "========================================" << endl;
    cout << "  RECORRIDOS DE ARBOLES BINARIOS - UTA" << endl;
    cout << "========================================" << endl;

    // ============================================
    // ARBOL DEL EJERCICIO 2 (con nodos 1,3,18,25)
    // ============================================
    Nodo* arbolNumerico = new Nodo(10);
    arbolNumerico->izquierda = new Nodo(5);
    arbolNumerico->derecha = new Nodo(15);
    arbolNumerico->izquierda->izquierda = new Nodo(2);
    arbolNumerico->izquierda->derecha = new Nodo(7);
    arbolNumerico->derecha->izquierda = new Nodo(12);
    arbolNumerico->derecha->derecha = new Nodo(20);

    // Nodos nuevos (ejercicio 2)
    arbolNumerico->izquierda->izquierda->izquierda = new Nodo(1);
    arbolNumerico->izquierda->izquierda->derecha = new Nodo(3);
    arbolNumerico->derecha->derecha->izquierda = new Nodo(18);
    arbolNumerico->derecha->derecha->derecha = new Nodo(25);

    // Mostrar estructura del árbol
    cout << "\n--- ESTRUCTURA DEL ARBOL ---" << endl;
    imprimirArbolBonito(arbolNumerico);

    // Mostrar recorridos
    cout << "\n--- RECORRIDOS DEL ARBOL ---" << endl;
    imprimirConFormato("Preorden", preorden, arbolNumerico);
    imprimirConFormato("Inorden", inorden, arbolNumerico);
    imprimirConFormato("Postorden", postorden, arbolNumerico);
    imprimirConFormato("BFS", bfs, arbolNumerico);
    
    // Ejercicios 3 y 4
    cout << "\n--- ESTADISTICAS DEL ARBOL ---" << endl;
    cout << "Total de nodos: " << contarNodos(arbolNumerico) << endl;
    cout << "Total de hojas: " << contarHojas(arbolNumerico) << endl;
    
    // ============================================
    // CASO APLICADO: SISTEMA DE GIMNASIO
    // ============================================
    cout << "\n========================================" << endl;
    cout << "  CASO APLICADO: SISTEMA DE GIMNASIO" << endl;
    cout << "========================================" << endl;
    
    // Crear árbol del Sistema de Gimnasio
    Nodo* gimnasio = new Nodo(1);  // 1 = Sistema Gimnasio
    gimnasio->izquierda = new Nodo(2);   // 2 = Gestión Clientes
    gimnasio->derecha = new Nodo(3);     // 3 = Gestión Pagos
    gimnasio->izquierda->izquierda = new Nodo(4);  // 4 = Registrar Cliente
    gimnasio->izquierda->derecha = new Nodo(5);    // 5 = Actualizar Cliente
    gimnasio->derecha->izquierda = new Nodo(6);    // 6 = Procesar Pago
    gimnasio->derecha->derecha = new Nodo(7);      // 7 = Reportar Pagos
    
    // Mostrar estructura del gimnasio
    cout << "\nESTRUCTURA DEL SISTEMA DE GIMNASIO:" << endl;
    cout << "====================================" << endl;
    cout << "1: Sistema Gimnasio (RAIZ)" << endl;
    cout << "|-- 2: Gestion Clientes" << endl;
    cout << "|   |-- 4: Registrar Cliente" << endl;
    cout << "|   |-- 5: Actualizar Cliente" << endl;
    cout << "|-- 3: Gestion Pagos" << endl;
    cout << "    |-- 6: Procesar Pago" << endl;
    cout << "    |-- 7: Reportar Pagos" << endl;
    
    // Mostrar recorridos del gimnasio
    cout << "\n--- RECORRIDOS DEL SISTEMA DE GIMNASIO ---" << endl;
    imprimirConFormato("Preorden (Menu principal -> submenus)", preorden, gimnasio);
    imprimirConFormato("Inorden (Modulos ordenados)", inorden, gimnasio);
    imprimirConFormato("Postorden (Hojas antes que padres)", postorden, gimnasio);
    imprimirConFormato("BFS (Nivel por nivel)", bfs, gimnasio);
    
    // Aplicación de cada recorrido
    cout << "\n--- APLICACION DE CADA RECORRIDO ---" << endl;
    cout << "Preorden:  Para mostrar el menu principal primero" << endl;
    cout << "Inorden:   Para mostrar modulos ordenados alfabeticamente" << endl;
    cout << "Postorden: Para procesar modulos internos (hojas) antes" << endl;
    cout << "BFS:       Para mostrar dashboard por niveles" << endl;
    
    cout << "\n========================================" << endl;
    
    return 0;
}