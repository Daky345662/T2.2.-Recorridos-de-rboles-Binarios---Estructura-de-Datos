import java.util.LinkedList;
import java.util.Queue;

class Nodo {
    int dato;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}

public class Main {
    
    // ========== RECORRIDOS PRINCIPALES ==========
    
    public static void preorden(Nodo raiz) {
        if (raiz == null) return;
        System.out.print(raiz.dato + " ");
        preorden(raiz.izquierda);
        preorden(raiz.derecha);
    }
    
    public static void inorden(Nodo raiz) {
        if (raiz == null) return;
        inorden(raiz.izquierda);
        System.out.print(raiz.dato + " ");
        inorden(raiz.derecha);
    }
    
    public static void postorden(Nodo raiz) {
        if (raiz == null) return;
        postorden(raiz.izquierda);
        postorden(raiz.derecha);
        System.out.print(raiz.dato + " ");
    }
    
    public static void bfs(Nodo raiz) {
        if (raiz == null) return;
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            System.out.print(actual.dato + " ");
            if (actual.izquierda != null) cola.add(actual.izquierda);
            if (actual.derecha != null) cola.add(actual.derecha);
        }
    }
    
    // ========== FUNCIONES ADICIONALES ==========
    
    public static void imprimirConFormato(String titulo, Nodo arbol) {
        System.out.print(titulo + ": ");
        if (titulo.contains("Preorden")) preorden(arbol);
        else if (titulo.contains("Inorden")) inorden(arbol);
        else if (titulo.contains("Postorden")) postorden(arbol);
        else if (titulo.contains("BFS")) bfs(arbol);
        System.out.println();
    }
    
    public static void imprimirArbolBonito(Nodo raiz, int nivel) {
        if (raiz == null) return;
        imprimirArbolBonito(raiz.derecha, nivel + 1);
        for (int i = 0; i < nivel; i++) System.out.print("    ");
        System.out.println(raiz.dato);
        imprimirArbolBonito(raiz.izquierda, nivel + 1);
    }
    
    // ========== CONTAR NODOS ==========
    public static int contarNodos(Nodo raiz) {
        if (raiz == null) return 0;
        return 1 + contarNodos(raiz.izquierda) + contarNodos(raiz.derecha);
    }
    
    // ========== CONTAR HOJAS ==========
    public static int contarHojas(Nodo raiz) {
        if (raiz == null) return 0;
        if (raiz.izquierda == null && raiz.derecha == null) return 1;
        return contarHojas(raiz.izquierda) + contarHojas(raiz.derecha);
    }
    
    // ========== MAIN ==========
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  RECORRIDOS DE ARBOLES BINARIOS - UTA");
        System.out.println("========================================");
        
        // ============================================
        // ARBOL DEL EJERCICIO 2 (con nodos 1,3,18,25)
        // ============================================
        Nodo arbolNumerico = new Nodo(10);
        arbolNumerico.izquierda = new Nodo(5);
        arbolNumerico.derecha = new Nodo(15);
        arbolNumerico.izquierda.izquierda = new Nodo(2);
        arbolNumerico.izquierda.derecha = new Nodo(7);
        arbolNumerico.derecha.izquierda = new Nodo(12);
        arbolNumerico.derecha.derecha = new Nodo(20);
        
        // Nodos nuevos (ejercicio 2)
        arbolNumerico.izquierda.izquierda.izquierda = new Nodo(1);
        arbolNumerico.izquierda.izquierda.derecha = new Nodo(3);
        arbolNumerico.derecha.derecha.izquierda = new Nodo(18);
        arbolNumerico.derecha.derecha.derecha = new Nodo(25);
        
        // Mostrar estructura del árbol
        System.out.println("\n--- ESTRUCTURA DEL ARBOL ---");
        imprimirArbolBonito(arbolNumerico, 0);
        
        // Mostrar recorridos
        System.out.println("\n--- RECORRIDOS DEL ARBOL ---");
        System.out.print("Preorden:  ");
        preorden(arbolNumerico);
        System.out.println();
        
        System.out.print("Inorden:   ");
        inorden(arbolNumerico);
        System.out.println();
        
        System.out.print("Postorden: ");
        postorden(arbolNumerico);
        System.out.println();
        
        System.out.print("BFS:       ");
        bfs(arbolNumerico);
        System.out.println();
        
        // Ejercicios 3 y 4
        System.out.println("\n--- ESTADISTICAS DEL ARBOL ---");
        System.out.println("Total de nodos: " + contarNodos(arbolNumerico));
        System.out.println("Total de hojas: " + contarHojas(arbolNumerico));
        
        // ============================================
        // CASO APLICADO: SISTEMA DE GIMNASIO
        // ============================================
        System.out.println("\n========================================");
        System.out.println("  CASO APLICADO: SISTEMA DE GIMNASIO");
        System.out.println("========================================");
        
        // Crear árbol del Sistema de Gimnasio
        Nodo gimnasio = new Nodo(1);  // 1 = Sistema Gimnasio
        gimnasio.izquierda = new Nodo(2);   // 2 = Gestión Clientes
        gimnasio.derecha = new Nodo(3);     // 3 = Gestión Pagos
        gimnasio.izquierda.izquierda = new Nodo(4);  // 4 = Registrar Cliente
        gimnasio.izquierda.derecha = new Nodo(5);    // 5 = Actualizar Cliente
        gimnasio.derecha.izquierda = new Nodo(6);    // 6 = Procesar Pago
        gimnasio.derecha.derecha = new Nodo(7);      // 7 = Reportar Pagos
        
        // Mostrar estructura del gimnasio
        System.out.println("\nESTRUCTURA DEL SISTEMA DE GIMNASIO:");
        System.out.println("====================================");
        System.out.println("1: Sistema Gimnasio (RAIZ)");
        System.out.println("├── 2: Gestion Clientes");
        System.out.println("│   ├── 4: Registrar Cliente");
        System.out.println("│   └── 5: Actualizar Cliente");
        System.out.println("└── 3: Gestion Pagos");
        System.out.println("    ├── 6: Procesar Pago");
        System.out.println("    └── 7: Reportar Pagos");
        
        // Mostrar recorridos del gimnasio
        System.out.println("\n--- RECORRIDOS DEL SISTEMA DE GIMNASIO ---");
        System.out.print("Preorden (Menu principal -> submenus): ");
        preorden(gimnasio);
        System.out.println();
        
        System.out.print("Inorden (Modulos ordenados): ");
        inorden(gimnasio);
        System.out.println();
        
        System.out.print("Postorden (Hojas antes que padres): ");
        postorden(gimnasio);
        System.out.println();
        
        System.out.print("BFS (Nivel por nivel): ");
        bfs(gimnasio);
        System.out.println();
        
        // Aplicación de cada recorrido
        System.out.println("\n--- APLICACION DE CADA RECORRIDO ---");
        System.out.println("✓ Preorden:  Para mostrar el menu principal primero");
        System.out.println("✓ Inorden:   Para mostrar modulos ordenados alfabeticamente");
        System.out.println("✓ Postorden: Para procesar modulos internos (hojas) antes");
        System.out.println("✓ BFS:       Para mostrar dashboard por niveles");
        
        System.out.println("\n========================================");
    }
}