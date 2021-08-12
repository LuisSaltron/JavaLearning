package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
	private int idTeclado;
	private static int contadorTeclado;

	public Teclado(String tipo, String marca) {
		super(tipo, marca);
		this.idTeclado = ++Teclado.contadorTeclado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado [idTeclado=");
		builder.append(idTeclado);
		builder.append("]"+super.toString());
		return builder.toString();
	}
}
