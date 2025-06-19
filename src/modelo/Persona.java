package modelo;

import interfaces.IPersona;
public class Persona implements IPersona{
	private String dni;
	private String nombre;
	private int edad;

	public Persona(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}


	@Override
	public String getDni() {
		return this.dni;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int getEdad() {
		return this.edad;
	}

	@Override
	public String toString() {
		return nombre + " (DNI: " + dni + ", Edad: " + edad + ")";
	}

}
