package modelo;

import interfaces.INodo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Nodo<T> implements INodo<T> {

    private T valor;
    private List<INodo<T>> vecinos;

    public Nodo(T valor) {
        this.valor = valor;
        this.vecinos = new ArrayList<>();
    }

    @Override
    public List<INodo<T>> getVecinos() {
        return vecinos;
    }

    @Override
    public T getValor() {
        return valor;
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

    // Clave para comparar nodos correctamente en BFS/DFS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Nodo)) return false;
        Nodo<?> otro = (Nodo<?>) obj;
        return Objects.equals(valor, otro.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
