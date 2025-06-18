package modelo;
import java.util.*;
import interfaces.IGrafo;
import interfaces.IGrafo;
import interfaces.INodo;

//grafo NO dirigido
public class Grafo<T> implements IGrafo<T>{

    private Map<Integer, INodo> nodos = new HashMap<>();//el grafo tiene

    @Override
    public void agregarNodo(int id, T valor) {// id sería la clave del "diccionario"; valor sería el valor asociado a esa clave,
        //en este caso, "valor" sería un objeto llamado persona. Entonces el Nodo sería una persona.
        if (!nodos.containsKey(id)){
            nodos.put(id, new Nodo<T>(valor));
        }
    }

    // con este metodo agregamos una arista (conexión) entre dos nodos existentes
    @Override
    public void agregarArista(int idOrigen, int idDestino) {//idOrigen e idDestino son los ID de los nodos existentes que deseamos conectar.
        if (nodos.containsKey(idOrigen) && nodos.containsKey(idDestino)){
            //Agarro el nodo que tiene
            //como clave al origen... get retorna el NODO
            INodo nodoOrigen = nodos.get(idOrigen);
            INodo nodoDestino = nodos.get(idDestino);

            //establecemos la conexión bidireccional entre los nodos que queremos unir.
            nodoOrigen.agregarVecino(nodoDestino);
            nodoDestino.agregarVecino(nodoOrigen);
        }
    }

    @Override
    public void mostrarMatrizAdyacencia() {

    }

    @Override
    public void mostrarListaAdyacencia() {

    }

    @Override
    public void bfs(int inicio) {

    }

    @Override
    public void dfs(int inicio) {

    }

    //
}
