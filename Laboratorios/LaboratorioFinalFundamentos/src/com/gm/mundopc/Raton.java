package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
	private int idRaton;
	private static int contadorRaton;
	
	public Raton(String tipo,String marca) {
		super(tipo,marca);
		this.idRaton=+Raton.contadorRaton;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raton [idRaton=");
		builder.append(idRaton);
		builder.append("]"+super.toString());
		return builder.toString();
	}

	
	
	
}
