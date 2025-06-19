package modelo;
import interfaces.INodo;

import java.util.ArrayList;
import java.util.List;

public class Nodo<T> implements INodo<T>{

    private T valor;
    private List<INodo> vecinos; //en un grafo, cada nodo tiene una lista de sus nodos adyacentes

    public Nodo(T valor){
        this.valor = valor;
        this.vecinos = new ArrayList<>(); //inicializamos el array
    }
    @Override
    public List<INodo<T>> getVecinos() {
        return List.of();
    }

    @Override
    public T getValor() {
        return null;
    }

    @Override
    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public void agregarVecino(INodo<T> vecino) {
        if (!vecinos.contains(vecino)) {
            vecinos.add(vecino);
        }
    }
}
