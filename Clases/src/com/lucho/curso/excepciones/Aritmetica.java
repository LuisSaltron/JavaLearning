package com.lucho.curso.excepciones;

public class Aritmetica {
	
	public static int divison(int numerador, int denominador) throws OperacionExcepcion {
		if (denominador==0) {
			throw new OperacionExcepcion("Divison entre cero");
		}
		else {
			return numerador/denominador;
		}
	}
}
