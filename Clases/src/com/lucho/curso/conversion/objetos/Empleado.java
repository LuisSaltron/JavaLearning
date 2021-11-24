package com.lucho.curso.conversion.objetos;

public class Empleado {
	protected String nombre;
	protected double sueldo;

	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	protected String obtenerDetalles() {
		return "Nombre " + this.nombre + ", Sueldo " + this.sueldo;
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
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
