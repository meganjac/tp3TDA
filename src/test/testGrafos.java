package test;

import modelo.Grafo;
import modelo.Persona;
import interfaces.IGrafo;

public class testGrafos {
    public static void main(String[] args) {
        // Crear el grafo con tipo Persona
        IGrafo<Persona> grafo = new Grafo<>();

        // Crear personas
        Persona ana = new Persona("123", "Ana", 30);
        Persona bruno = new Persona("234", "Bruno", 25);
        Persona carla = new Persona("345", "Carla", 28);
        Persona dario = new Persona("456", "Dario", 35);
        Persona emma = new Persona("567", "Emma", 22);

        // Agregar personas como nodos al grafo con sus IDs
        grafo.agregarNodo(1, ana);
        grafo.agregarNodo(2, bruno);
        grafo.agregarNodo(3, carla);
        grafo.agregarNodo(4, dario);
        grafo.agregarNodo(5, emma);

        // Agregar aristas (conexiones entre personas)
        grafo.agregarArista(1, 2); // Ana - Bruno
        grafo.agregarArista(2, 3); // Bruno - Carla
        grafo.agregarArista(3, 4); // Carla - Dario
        grafo.agregarArista(4, 5); // Dario - Emma
        grafo.agregarArista(1, 5); // Ana - Emma

        // Mostrar la matriz y lista de adyacencia
        System.out.println(" Matriz de adyacencia:");
        grafo.mostrarMatrizAdyacencia();

        System.out.println("\n Lista de adyacencia:");
        grafo.mostrarListaAdyacencia();

        // Realizar recorrido BFS y DFS desde Ana (ID 1)
        System.out.println("\n Recorrido BFS desde Ana:");
        grafo.bfs(1);

        System.out.println("\n Recorrido DFS desde Ana:");
        grafo.dfs(1);
    }
}
