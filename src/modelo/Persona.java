package modelo;

import interfaces.IPersona;
public class Persona implements IPersona{
	private int dni; //cambiamos el DNI a tipo entero
    private String nombre;
    private int edad;
 
    public Persona(int dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }


	@Override
	public int getDni() {
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
}
