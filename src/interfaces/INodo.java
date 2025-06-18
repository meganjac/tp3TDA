package interfaces;

import java.util.List;

public interface INodo<T> {

	/*
	 PRE: -
	 POST: Lista creada y asociada a cada instancia de interfaces.INodo
	 AX: - 
	 */
	List<INodo> getVecinos(); //constante
	
	/*getters & setters*/
	T getValor(); //valor de tipo genérico
	void setValor(T valor);
	

	/*
	 *insertar elementos en la lista Vecinos
	 * PRE: lista creada, independientemente de la cantidad de elementos
	 * POST: el vecino debe quedar insertado a la lista de adyacencia, como último elemento
	 * */
	public void agregarVecino(INodo vecino);
}

