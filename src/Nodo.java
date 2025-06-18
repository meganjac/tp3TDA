import java.util.ArrayList;
import java.util.List;

import interfaces.INodo;

public class Nodo<T> implements INodo {
	
    private int valor; // Valor almacenado en el nodo; T <T>
    private List<INodo> vecinos; // Lista de nodos vecinos (adyacentes)
    //los algoritmos de búsqueda usan la lista para simular la pila
    //pueden ponerse la cola y la pila y que cada recorrido utilice la estructura correspondiente
    //, pero eso consumiría memoria al duplicar la información

    // Constructor
    public Nodo(<T> valor) {
        this.valor = valor;
        this.vecinos = new ArrayList<>();
    }

    // Getter del valor
    public int getValor() {
        return valor;
    }

    // Setter del valor
    public void setValor(int valor) {
        this.valor = valor;
    }

    // Agrega un nodo vecino a la lista de adyacencia
    public void agregarVecino(INodo vecino) {
        if (!vecinos.contains(vecino)) { //si el vecino no está en la lista
            vecinos.add(vecino);
        }
    }

    // Devuelve la lista de vecinos
    public List<INodo> getVecinos() {
        return vecinos;
    }
}