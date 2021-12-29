package com.lucho.curso.clase.object;

public class Escritor extends Empleado {
	final TipoEscritura tipoEscritura;

	public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
		super(nombre, sueldo);
		this.tipoEscritura = tipoEscritura;
	}

	@Override
	public String obtenerDetalles() {
		return super.obtenerDetalles() + ", tipo de escritura: " + tipoEscritura;
	}
	
	/**
	 * @return the tipoEscritura
	 */
	public TipoEscritura getTipoEscritura() {
		return tipoEscritura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Escritor [tipoEscritura=");
		builder.append(tipoEscritura);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
