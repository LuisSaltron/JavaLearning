package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainIndices {
	private static int[] numeros = new int[10];

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingresa el número para adicionar al array: ");
			int numero = lectura.nextInt();
			llenarArray(numero, i);
		}
		mostrarArray();
	}

	public static void llenarArray(int valor, int posicion) {
		numeros[posicion] = valor;
	}

	public static void mostrarArray() {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion: " + i + "  Valor: " + numeros[i]);
		}
	}
}