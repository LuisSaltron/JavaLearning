package com.lucho.curso.palabraFinal;

public class Persona {
	private String nombre;
	public final static int NUM=12;
	public  void imprimir() {
		System.out.println("Metodo final imprimir");
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
	
}
