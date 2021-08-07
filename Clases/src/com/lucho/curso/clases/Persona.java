package com.lucho.curso.clases;

public class Persona {
	String nombre;
	String apellido;
	String ocupacion;

	public Persona(String nombre, String apellido, String ocupacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ocupacion = ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", ocupacion=" + ocupacion + "]";
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOcupacion() {
		return ocupacion;
	}
}
