package modelo;

import java.util.Comparator;

public class ComparadorPorDNI implements Comparator<Persona>{
	@Override
	public int compare(Persona p1, Persona p2) {
		return p1.getDni().compareTo(p2.getDni());
	}
}