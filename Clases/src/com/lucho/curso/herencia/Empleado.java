package com.lucho.curso.herencia;

public class Empleado extends Persona {
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado(){
		this.idEmpleado=++Empleado.contadorEmpleado;
	}
	public Empleado(String nombre, double sueldo) {
		super(nombre); 
		this.sueldo = sueldo;
	}

	public Empleado(String nombre) {
		super(nombre);
		this.idEmpleado=++Empleado.contadorEmpleado;
	}

	public Empleado(String nombre, char genero, int edad, String direccion) {
		super(nombre, genero, edad, direccion);
		Empleado.contadorEmpleado++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(idEmpleado);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the idEmpleado
	 */
	public int getIdEmpleado() {
		return idEmpleado;
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
