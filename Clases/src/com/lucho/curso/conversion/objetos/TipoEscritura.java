package com.lucho.curso.conversion.objetos;

public enum TipoEscritura {
	CLASICO("Escritura a mano"), MODERNO("Escritura digital");

	private final String description;

	private TipoEscritura(String descripcion) {
		this.description = descripcion;
	}
	
	public String getDescription() {
		return this.description;
	}
}
