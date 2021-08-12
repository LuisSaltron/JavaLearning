package com.gm.mundopc;

import java.util.Arrays;

public class Orden {
	private int idOrden;
	private Computador[] computadoras;
	private static int contadorOrden;
	private static int contadorComputadoras;
	private static final int MAX_COMPUTADORAS=4;
	
	public Orden() {
		this.idOrden=++Orden.contadorOrden;
		this.computadoras= new Computador[Orden.MAX_COMPUTADORAS];
	}
	
	public void agregarComputador(Computador computador) {
		if (Orden.contadorComputadoras<Orden.MAX_COMPUTADORAS) {
			this.computadoras[Orden.contadorComputadoras++]=computador;
		}
		else {
			System.out.println("Ha superado el limite de computadores");
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
