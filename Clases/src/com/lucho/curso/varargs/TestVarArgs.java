package com.lucho.curso.varargs;

public class TestVarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirNumeros(3, 4, 5);
		imprimirNumeros(2, 1);
		variosParametros("Luis", 3, 4, 5);
	}

	private static void imprimirNumeros(int... numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	private static void variosParametros(String nombre, int... numeros) {
		System.out.println("Nombre: " + nombre);
		imprimirNumeros(numeros);
	}
}
