package com.gm.mundopc2;

public class Computadora {
	private int idComputador;
	private static int contadorComputadoras;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	
	private Computadora() {
		this.idComputador=++Computadora.contadorComputadoras;
	}

	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computadora [idComputador=");
		builder.append(idComputador);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", teclado=");
		builder.append(teclado);
		builder.append(", raton=");
		builder.append(raton);
		builder.append("]");
		return builder.toString();
	}
	 
}
