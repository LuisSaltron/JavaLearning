package com.lucho.curso.contexto.estatico;

public class Persona {
	private int idPersona;
	private String nombre;
	private static int contadorPersonas;
	
	public Persona(String nombre) {
		this.nombre=nombre;
		//Incrementar el contador por cada objeto nuevo
		Persona.contadorPersonas++;
		this.idPersona=Persona.contadorPersonas;
	}

	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the contadorPersonas
	 */
	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	/**
	 * @param contadorPersonas the contadorPersonas to set
	 */
	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
