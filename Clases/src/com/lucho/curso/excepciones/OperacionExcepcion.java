package com.lucho.curso.excepciones;

@SuppressWarnings("serial")
public class OperacionExcepcion extends Exception {
	
	public OperacionExcepcion(String mensaje) {
		super(mensaje);
	}
}
