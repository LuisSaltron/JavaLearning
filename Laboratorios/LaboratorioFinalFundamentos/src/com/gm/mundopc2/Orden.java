package com.gm.mundopc2;

import java.util.Arrays;

public class Orden {
	private int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private static int contadorComputadoras;
	private static final int MAX_COMPUTADORAS=4;
	
	public Orden() {
		this.idOrden=++Orden.contadorOrdenes;
		this.computadoras=new Computadora[Orden.MAX_COMPUTADORAS];
	}
	
	public void agregarComputadora(Computadora computadora) {
		if (Orden.contadorComputadoras<Orden.MAX_COMPUTADORAS) {
			this.computadoras[Orden.contadorComputadoras]=computadora;
		}
		else {
			System.out.println("has llegado al máximo");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Orden [idOrden=");
		builder.append(idOrden);
		builder.append(", computadoras=");
		builder.append(Arrays.toString(computadoras));
		builder.append("]");
		return builder.toString();
	}
}
