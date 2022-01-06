package com.lucho.curso.excepciones;

public class Aritmetica {
	
	public static int division(int numerador, int denominador) throws OperacionExcepcion {
		if (denominador==0) {
			throw new OperacionExcepcion("Division entre cero");
		}
		else {
			return numerador/denominador;
		}
	}
}
