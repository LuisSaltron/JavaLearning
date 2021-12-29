package com.lucho.curso.javaBeans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Persona implements Serializable {
	private String nombre;
	private String apellido;

	public Persona() {

	}

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append("]");
		return builder.toString();
	}

}
