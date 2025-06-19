package interfaces;

import java.util.List;

public interface INodo<T> {

	/*
	 PRE: -
	 POST: Lista creada y asociada a cada instancia de interfaces.INodo
	 AX: -
	 */
	List<INodo<T>> getVecinos(); //constante

	/*getters & setters*/
	T getValor(); //valor de tipo genérico
	void setValor(T valor);


	void agregarVecino(INodo<T> vecino);
}

