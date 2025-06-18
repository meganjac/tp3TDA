package modelo;
import interfaces.INodo;

import java.util.ArrayList;
import java.util.List;

public class Nodo implements INodo{

    private int valor;
    private List<INodo> vecinos; //en un grafo, cada nodo tiene una lista de sus nodos adyacentes

    public Nodo(int valor){
        this.valor = valor;
        this.vecinos = new ArrayList<>(); //inicializamos el array
    }
    @Override
    public List<INodo> getVecinos() {
        return List.of();
    }

    @Override
    public Object getValor() {
        return null;
    }

    @Override
    public void setValor(Object valor) {

    }

    @Override
    public void agregarVecino(INodo vecino) {

    }
}
